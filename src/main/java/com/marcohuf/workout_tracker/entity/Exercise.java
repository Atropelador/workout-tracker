package com.marcohuf.workout_tracker.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "exercise")
@Getter
@Setter
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
    private double weight;

    //fetch = FetchType.LAZY delays loading until needed (recommended for performance).
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id", nullable = false)
    private Workout workout;

}
