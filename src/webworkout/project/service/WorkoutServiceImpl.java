package webworkout.project.service;

import webworkout.project.dao.WorkoutRepository;
import webworkout.project.exception.InvalidEntityDataException;
import webworkout.project.exception.NoneexistingEntityException;
import webworkout.project.model.Workout;
import webworkout.project.util.WorkoutValidator;

import java.util.Collection;

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
    public Collection<Workout> getAllWorkouts() {
        return null;
    }

    @Override
    public Workout getWorkoutById(Workout id) throws NoneexistingEntityException {
        return workoutRepository.create(id);
    }

    @Override
    public Workout addWorkout(Workout workout) throws InvalidEntityDataException {
        return workoutRepository.create(workout);
    }

    @Override
    public Workout updateWorkout(Workout workout) throws NoneexistingEntityException {
        return workoutRepository.update(workout);
    }

    @Override
    public Workout deleteWorkoutById(Long id) throws NoneexistingEntityException {
        return workoutRepository.deleteById(id);
    }

    @Override
    public long count() {
        return 0;
    }
}
