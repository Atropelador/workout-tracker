package com.marcohuf.workout_tracker.service;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.entity.Workout;

import java.util.Date;
import java.util.List;

public interface WorkoutService {
    List<WorkoutDTO> createWorkout(WorkoutDTO workout);

    List<WorkoutDTO> updateWorkout(WorkoutDTO workout);

    List<WorkoutDTO> deleteWorkout(int id);

    List<WorkoutDTO> getAllWorkouts();

}
