package com.marcohuf.workout_tracker.dto;

import com.marcohuf.workout_tracker.entity.Exercise;
import com.marcohuf.workout_tracker.entity.Workout;

import java.util.List;

public class WorkoutDTO {
    private int id;
    private String name;
    private List<Exercise> exerciseList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exercise> getExerciseList() {
        return exerciseList;
    }

    public void setExerciseList(List<Exercise> exerciseList) {
        this.exerciseList = exerciseList;
    }
}
