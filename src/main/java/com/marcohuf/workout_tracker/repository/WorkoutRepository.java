package com.marcohuf.workout_tracker.repository;

import com.marcohuf.workout_tracker.entity.Workout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<Workout, Integer> {
}
