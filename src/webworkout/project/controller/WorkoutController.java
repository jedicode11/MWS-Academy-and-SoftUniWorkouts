package webworkout.project.controller;

import webworkout.project.exception.InvalidEntityDataException;
import webworkout.project.model.Workout;
import webworkout.project.service.WorkoutService;
import webworkout.project.view.Menu;
import webworkout.project.view.NewWorkoutLog;

import java.util.List;

public class WorkoutController {
    private WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    public void init() throws InvalidEntityDataException {
        var menu = new Menu("Main Menu", List.of(
                new Menu.Option("Generate Workouts", () -> {
                    System.out.println("Generate Workouts ...");
                    return "Workouts loaded successfully.";
                }),
                new Menu.Option("Print All Workouts", () -> {
                    var workouts = workoutService.getAllWorkouts();
                    workouts.forEach(System.out::println);
                    return "Total workout count: " + workoutService.getAllWorkouts();
                }),
                new Menu.Option("Add New workouts", () -> {
                    Workout workout = new NewWorkoutLog().input();
                    var workouts = workoutService.getWorkoutById(workout);
                    return "Workout ID: '%s' added successfully";
                })
        ));
        menu.show();
    }
}
