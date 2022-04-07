package WebWorkout.project.util;

import WebWorkout.project.exception.ConstraintViolationException;
import WebWorkout.project.model.Workout;

import java.util.ArrayList;
import java.util.List;

public class WorkoutValidator {
    public void validate(Workout workout) throws ConstraintViolationException {
        List<ConstraintViolationException> violations = new ArrayList<>();
        var titleLength = workout.getTitle().trim().length();
        if(titleLength < 2 || titleLength > 50){
            violations.add(
                    new ConstraintViolationException(workout.getClass().getName(), "title", workout.getTitle(),
                            "Workout title length should be between 2 and 50 characters"));
           }
        if(workout.getTags().length() < 2 || workout.getTags().length() < 5){
            violations.add(
                    new ConstraintViolationException(workout.getClass().getName(), "tags", workout.getTags(),
                            "Tags length should be between 2 and 50 characters"));
        }
        if(violations.size() > 0) {
            throw new ConstraintViolationException("Invalid workout field", violations);
        }
    }
}
