package WebWorkout.project.model;

import java.io.Serializable;
import java.time.LocalDate;

public class MockWorkouts {
    public static final Workout[] MOCK_WORKOUTS;
    static {
        LocalDate localDate = LocalDate.now();
        MOCK_WORKOUTS = new Workout[]{new Workout("Calisthenics", "Bill Morison",
                "Bicep and Triceps", 200, "Fitness Workout & Conditioning."),
                new Workout("Swimming", "Jaden Dreams",
                        "Crawl & BackStroke", 400, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James", "Dribble & Triples", 60,"Vert & Precision."),
                new Workout("Snowboarding", "Torstein Horgmo",
                        "Slopes or Pipe", 500, "Freestyle & Vert"),
                new Workout("Swimming", "Jaden Dreams",
                        "Crawl & BackStroke", 400, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James", "Dribble & Triples", 60,"Vert & Precision."),
                new Workout("Calisthenics", "Bill Morison",
                        "Bicep and Triceps", 200, "Fitness Workout & Conditioning."),
                new Workout("Swimming", "Jaden Dreams",
                        "Crawl & BackStroke", 400, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James", "Dribble & Triples", 60,"Vert & Precision."),
                new Workout("Snowboarding", "Torstein Horgmo",
                        "Slopes or Pipe", 500, "Freestyle & Vert"),
                new Workout("Swimming", "Jaden Dreams",
                        "Crawl & BackStroke", 400, "Agility & MuscleFibers"),
                new Workout("Basketball", "Micheal James", "Dribble & Triples", 60,"Vert & Precision.")
        };
    }
}
