package WebWorkout.project.view;

import WebWorkout.project.model.Workout;

import java.time.LocalDate;
import java.time.MonthDay;
import java.util.Scanner;

public class NewWorkoutLog {
    public static Scanner scanner = new Scanner(System.in);

    public NewWorkoutLog() {
        super();
    }

    public Workout input() {
        var workout = new Workout();
        while (workout.getTitle() == null) {
            System.out.println("Tile:");
            var sport = scanner.nextLine();
            if (sport.length() < 2) {
                System.out.println("Error: The workout title should be at least 2 characters long.");
            } else {
                workout.setTitle(sport);
            }
        }
        while (workout.getPublisher() == null) {
            System.out.println("Publishers (comma separated):");
            var sport = scanner.nextLine();
            if (sport.length() < 4) {
                System.out.println("Error: The workout publishers should be at least 4 characters long.");
            } else {
                workout.setPublisher(sport);
            }
        }
        return workout;
    }
}
