package com.marcohuf.workout_tracker.rest;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import com.marcohuf.workout_tracker.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workouts")
public class WorkoutRestController {
    private final WorkoutService workoutService;

    @Autowired
    public WorkoutRestController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping
    public List<WorkoutDTO> list(){
        return workoutService.getAllWorkouts();
    }

    @PostMapping
    public List<WorkoutDTO> create(@RequestBody WorkoutDTO workoutDTO){
        workoutDTO.setId(0);
        return workoutService.createWorkout(workoutDTO);
    }

    @PutMapping("/{id}")
    public List<WorkoutDTO> update(@PathVariable int id, @RequestBody WorkoutDTO workoutDTO){
        workoutDTO.setId(id);
        return workoutService.updateWorkout(workoutDTO);
    }

    @DeleteMapping("/{id}")
    public List<WorkoutDTO> delete(@PathVariable int id){
        return workoutService.deleteWorkout(id);
    }

    public List<WorkoutDTO> schedule(){
        return null;
    }

    //Generate reports on past workouts and progress.
    public List<WorkoutDTO> generateReports(){
        return null;
    }
}
