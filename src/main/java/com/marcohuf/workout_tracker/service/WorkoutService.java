package com.marcohuf.workout_tracker.service;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.entity.Workout;

import java.util.Date;
import java.util.List;

public interface WorkoutService {
    List<Workout> createWorkout(Workout workout);

    List<Workout> updateWorkout(Workout workout);

    List<Workout> deleteWorkout(int id);

    List<WorkoutDTO> getAllWorkouts();

}
