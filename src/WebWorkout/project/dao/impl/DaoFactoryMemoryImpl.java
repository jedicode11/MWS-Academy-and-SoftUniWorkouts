package WebWorkout.project.dao.impl;

import WebWorkout.project.dao.DaoFactory;
import WebWorkout.project.dao.UserRepository;
import WebWorkout.project.dao.WorkoutRepository;

public class DaoFactoryMemoryImpl implements DaoFactory {
    @Override
    public WorkoutRepository createWorkoutRepository() {
        return null;
    }

    @Override
    public WorkoutRepository createWorkoutRepository(String dbFileName) {
        return null;
    }

    @Override
    public WorkoutRepository createWorkoutRepositoryFile(String dbFileName) {
        return null;
    }

    @Override
    public UserRepository createUserRepository() {
        return null;
    }
}
