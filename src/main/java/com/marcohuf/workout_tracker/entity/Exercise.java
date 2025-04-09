package com.marcohuf.workout_tracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {
    public Exercise() {
    }

    public Exercise(String name, String type, int sets, int reps, int weight, Workout workout) {
        this.name = name;
        this.type = type;
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
        this.workout = workout;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name= "name")
    private String name;
    @Column(name= "type")
    private String type;
    @Column(name= "sets")
    private int sets;
    @Column(name= "reps")
    private int reps;
    @Column(name= "weight")
    private int weight;

    //fetch = FetchType.LAZY delays loading until needed (recommended for performance).
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
