package WebWorkout.project.controller;

import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.model.Workout;
import WebWorkout.project.service.WorkoutService;
import WebWorkout.project.view.Menu;
import WebWorkout.project.view.NewWorkoutLog;

import java.util.List;

public class WorkoutController {
    private WorkoutService workoutService;

//    public WorkoutController(WorkoutService workoutService) {
//        this.workoutService = workoutService;
//    }
//
//    public void init() throws InvalidEntityDataException {
//        var menu = new Menu("Main Menu", List.of(
//                new Menu.Option("Generate Workouts", () -> {
//                    System.out.println("Generate Workouts ...");
//                    workoutService.loadData();
//                    return "Workouts loaded successfully.";
//                }),
//                new Menu.Option("Print All Books", () -> {
//                    var books = workoutService.getAllWorkouts();
//                    books.forEach(System.out::println);
//                    return "Total book count: " + books.size();
//                }),
//                new Menu.Option("Add New books", () -> {
//                    Workout workout = new NewWorkoutLog().input();
//                    var workouts = workoutService.getWorkoutById(workout);
//                    return String.format("Workout ID:%s: '%s' added successfull");
//                })
//        ));
//        menu.show();
//    }
}
