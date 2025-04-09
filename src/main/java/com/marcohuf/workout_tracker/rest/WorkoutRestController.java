package com.marcohuf.workout_tracker.rest;

import com.marcohuf.workout_tracker.dto.WorkoutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutRestController {
    public WorkoutRestController() {

    }

    //Allow users to create workouts composed of multiple exercises.
    @PostMapping
    public List<WorkoutDTO> create(){
        return null;
    }
    //Allow users to update workouts and add comments.
    @PutMapping("/{id}")
    public List<WorkoutDTO> update(){
        return null;
    }
    //Allow users to delete workouts.
    @DeleteMapping("/{id}")
    public List<WorkoutDTO> delete(){
        return null;
    }
    //Allow users to schedule workouts for specific dates and times.
    public List<WorkoutDTO> schedule(){
        return null;
    }
    //List active or pending workouts sorted by date and time.
    public List<WorkoutDTO> list(){
        return null;
    }
    //Generate reports on past workouts and progress.
    public List<WorkoutDTO> generateReports(){
        return null;
    }
}
