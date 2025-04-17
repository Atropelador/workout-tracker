package com.marcohuf.workout_tracker.dto;

import com.marcohuf.workout_tracker.entity.Exercise;
import com.marcohuf.workout_tracker.entity.Workout;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class WorkoutDTO {
    private int id;
    private String name;
    private List<ExerciseDTO> exerciseDTOList;
}
