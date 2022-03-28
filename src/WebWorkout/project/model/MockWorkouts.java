package WebWorkout.project.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MockWorkouts {
    public static final Workout[] MOCK_WORKOUTS;

    static {
        DateTimeFormatter newDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        MOCK_WORKOUTS = new Workout[]{new Workout("Calisthenics", "Bill Morison", LocalDate.parse("27.03.2022", newDate),
                "Bicep and Triceps", 100, "Fitness Workout & Conditioning."),
                new Workout("Swimming", "Jaden Dreams", LocalDate.parse("20.02.2017", newDate),
                        "Crawl & BackStroke", 1000, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James",
                        LocalDate.parse("10.04.2022", newDate), "Dribble & Triples", 60,"Vert & Precision."),
                new Workout("Calisthenics", "Bill Morison", LocalDate.parse("2022", newDate),
                        "Bicep and Triceps", 100, "Fitness Workout & Conditioning."),
                new Workout("Swimming", "Jaden Dreams", LocalDate.parse("20.02.2017", newDate),
                        "Crawl & BackStroke", 1000, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James",
                        LocalDate.parse("10.04.2022", newDate), "Dribble & Triples", 60,"Vert & Precision."),
                new Workout("Calisthenics", "Bill Morison", LocalDate.parse("27.03.2022", newDate),
                        "Bicep and Triceps", 100, "Fitness Workout & Conditioning."),
                new Workout("Swimming", "Jaden Dreams", LocalDate.parse("20.02.2017", newDate),
                        "Crawl & BackStroke", 1000, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James",
                        LocalDate.parse("10.04.2022", newDate), "Dribble & Triples", 60,"Vert & Precision."),
                new Workout("Calisthenics", "Bill Morison", LocalDate.parse("27.03.2022", newDate),
                        "Bicep and Triceps", 100, "Fitness Workout & Conditioning."),
                new Workout("Swimming", "Jaden Dreams", LocalDate.parse("20.02.2017", newDate),
                        "Crawl & BackStroke", 1000, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James",
                        LocalDate.parse("10.04.2022", newDate), "Dribble & Triples", 60,"Vert & Precision.")
        };
    }
}
