package com.marcohuf.workout_tracker.mapper;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.entity.Workout;

import org.mapstruct.Mapper;

import java.util.ArrayList;
@Mapper(componentModel = "spring")
public interface WorkoutMapper {
    WorkoutDTO toDTO(Workout workout);
    Workout toEntity(WorkoutDTO workoutDTO);
}
