package WebWorkout.project.service;

import WebWorkout.project.dao.WorkoutRepository;
import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;
import WebWorkout.project.util.WorkoutValidator;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class WorkoutServiceImpl implements WorkoutService{
    private final WorkoutRepository workoutRepository;
    private final WorkoutValidator workoutValidator;

    public WorkoutServiceImpl(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
        this.workoutValidator = new WorkoutValidator();
    }

    public WorkoutServiceImpl(WorkoutRepository workoutRepository, WorkoutValidator workoutValidator) {
        this.workoutRepository = workoutRepository;
        this.workoutValidator = workoutValidator;
    }

    @Override
    public void loadDate() {
        workoutRepository.load();

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
    public Workout getWorkoutById(Workout id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public Workout addWorkout(Workout workout) throws InvalidEntityDataException {
        return workoutRepository.create(workout);
    }

    @Override
    public Workout updateWorkout(Workout workout) throws NoneexistingEntityException, InvalidEntityDataException {
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

    @Override
    public void loadData() {

    }
}
