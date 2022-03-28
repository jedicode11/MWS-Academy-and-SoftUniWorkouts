package WebWorkout.project.service;

import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface WorkoutService {
    Collection<Workout> getAllWorkouts();
    List<Workout> getAllWorkouts(Comparator<Workout> comp);

    List<Workout> getAllWorkoutsByDate(boolean ascending);

    Workout getWorkoutById(Long id) throws NoneexistingEntityException;
    Workout addWorkout(Workout workout) throws InvalidEntityDataException;
    Workout updateWorkout(Workout workout) throws NoneexistingEntityException;
    Workout deleteWorkoutById(Long id) throws NoneexistingEntityException;
    long count();
}
