package com.marcohuf.workout_tracker.mapper;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.entity.Workout;

import java.util.ArrayList;

public class WorkoutMapper {

    public static WorkoutDTO mapToDTO(Workout workout){
        WorkoutDTO dto = new WorkoutDTO();
        dto.setId(workout.getId());
        dto.setName(workout.getName());
        dto.setExerciseList(workout.getExercises());

        return dto;
    }

    public static Workout mapToEntity(WorkoutDTO workoutDTO){
        Workout workout = new Workout();
        workout.setId(workoutDTO.getId());
        workout.setName(workoutDTO.getName());
        if (workoutDTO.getExerciseList() == null) {
            workout.setExercises(new ArrayList<>());
        } else {
            workout.setExercises(workoutDTO.getExerciseList());
        }
        return workout;
    }

}
