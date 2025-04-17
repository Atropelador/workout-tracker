package com.marcohuf.workout_tracker.mapper;

import com.marcohuf.workout_tracker.dto.ExerciseDTO;
import com.marcohuf.workout_tracker.entity.Exercise;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {
    ExerciseDTO toDTO(Exercise exercise);
    Exercise toEntity(ExerciseDTO dto);
}
