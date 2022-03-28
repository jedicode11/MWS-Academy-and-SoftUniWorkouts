package WebWorkout.project;

import WebWorkout.project.model.Workout;

public class Main {
    public static void main(String[] args) {

        // create the object
        Workout myWorkout = new Workout();
        myWorkout.dailyWorkout();

        //use the object
        System.out.println("Track run: 2x100m / Push-Ups after");
    }
}
