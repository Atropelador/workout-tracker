package com.marcohuf.workout_tracker.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workouts/{workoutId}/exercises")
public class ExerciseRestController {
}
