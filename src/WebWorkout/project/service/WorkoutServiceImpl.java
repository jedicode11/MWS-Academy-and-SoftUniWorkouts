package WebWorkout.project.service;

import WebWorkout.project.dao.WorkoutRepository;
import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;


public class WorkoutServiceImpl implements WorkoutService{
    private final WorkoutRepository workoutRepository;

    public WorkoutServiceImpl(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @Override
    public Collection<Workout> getAllWorkouts() {
        return null;
    }

    @Override
    public List<Workout> getAllWorkouts(Comparator<Workout> comp) {
        return null;
    }

    @Override
    public List<Workout> getAllWorkoutsByDate(boolean ascending) {
        return null;
    }

    @Override
    public Workout getWorkoutById(Long id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public Workout addWorkout(Workout workout) throws InvalidEntityDataException {
        return null;
    }

    @Override
    public Workout updateWorkout(Workout workout) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public Workout deleteWorkoutById(Long id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
