package com.marcohuf.workout_tracker.service;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.entity.Workout;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkoutServiceImpl implements WorkoutService{
    private final EntityManager entityManager;

    public WorkoutServiceImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Workout> createWorkout(Workout workout) {
        return List.of();
    }

    @Override
    public List<Workout> updateWorkout(Workout workout) {
        return List.of();
    }

    @Override
    public List<Workout> deleteWorkout(int id) {
        return List.of();
    }

    @Override
    public List<WorkoutDTO> getAllWorkouts() {
        List<WorkoutDTO> workoutList = new ArrayList<>();

        TypedQuery<Workout> theQuery = entityManager.createQuery("FROM Workout", Workout.class);
        System.out.println("Generated Query: " + theQuery.unwrap(org.hibernate.query.Query.class).getQueryString());
        for (Workout workout : theQuery.getResultList()){
            WorkoutDTO dto = WorkoutDTO.mapToDTO(workout);
            workoutList.add(dto);
        }

        return workoutList;
    }
}
