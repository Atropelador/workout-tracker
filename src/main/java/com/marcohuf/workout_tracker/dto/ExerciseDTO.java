package com.marcohuf.workout_tracker.dto;

import com.marcohuf.workout_tracker.entity.Workout;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ExerciseDTO {
    private String name;
    private String type;
    private int sets;
    private int reps;
    private double weight;
}
