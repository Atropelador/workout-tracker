package com.marcohuf.workout_tracker.service;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.entity.Workout;
import com.marcohuf.workout_tracker.mapper.WorkoutMapper;
import com.marcohuf.workout_tracker.repository.WorkoutRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService{
    private final EntityManager entityManager;
    private final WorkoutRepository workoutRepository;

    public WorkoutServiceImpl(EntityManager entityManager, WorkoutRepository workoutRepository) {
        this.entityManager = entityManager;
        this.workoutRepository = workoutRepository;
    }

    @Override
    public List<WorkoutDTO> createWorkout(WorkoutDTO workoutDTO) {
        if (workoutDTO == null || workoutDTO.getName().isEmpty()) {
            throw new IllegalArgumentException("Workout name cannot be null or empty");
        }
        Workout workout = WorkoutMapper.mapToEntity(workoutDTO);
        workoutRepository.save(workout);
        System.out.println("Workout created with id: " + workout.getId());

        return getAllWorkouts();
    }

    @Override
    public List<WorkoutDTO> updateWorkout(WorkoutDTO workoutDTO) {
        if (workoutDTO == null || workoutDTO.getId() <= 0) {
            throw new IllegalArgumentException("Invalid workout ID");
        }

        Workout workout = workoutRepository.findById(workoutDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("Workout not found with id: " + workoutDTO.getId()));
        workout.setName(workoutDTO.getName());
        workoutRepository.save(workout);

        return getAllWorkouts();
    }

    @Override
    public List<WorkoutDTO> deleteWorkout(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Invalid workout ID");
        }
        Workout workout = workoutRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Workout not found with id: " + id));
        workoutRepository.delete(workout);
        return getAllWorkouts();
    }

    @Override
    public List<WorkoutDTO> getAllWorkouts() {
        List<WorkoutDTO> workoutList = new ArrayList<>();

        TypedQuery<Workout> theQuery = entityManager.createQuery("FROM Workout", Workout.class);
        System.out.println("Generated Query: " + theQuery.unwrap(org.hibernate.query.Query.class).getQueryString());
        for (Workout workout : theQuery.getResultList()){
            WorkoutDTO dto = WorkoutMapper.mapToDTO(workout);
            workoutList.add(dto);
        }

        return workoutList;
    }
}
