package com.marcohuf.workout_tracker.repository;

import com.marcohuf.workout_tracker.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer> {
}
