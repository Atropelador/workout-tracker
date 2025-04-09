package com.marcohuf.workout_tracker.seeder;

import com.marcohuf.workout_tracker.entity.Exercise;
import com.marcohuf.workout_tracker.entity.Workout;
import com.marcohuf.workout_tracker.repository.ExerciseRepository;
import com.marcohuf.workout_tracker.repository.WorkoutRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WorkoutSeeder {
    // This class is used to seed the database with initial data
    @Bean
    CommandLineRunner seedExercises(WorkoutRepository repository, ExerciseRepository exerciseRepository) {
        return args -> {
            List<Exercise> exerciseList = new ArrayList<>();
            Workout workout = new Workout(
                    "Workout number 1",
                    exerciseList
            );

            //repository.save(workout);
            exerciseList.add(new Exercise("Bench Press", "Strenght", 3, 10,100 , workout));
            //exerciseRepository.saveAll(exerciseList);
            System.out.println("✅ Seeded one workout to the database.");
        };
    }
}
