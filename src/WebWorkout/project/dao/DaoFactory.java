package WebWorkout.project.dao;

public interface DaoFactory {
    WorkoutRepository createWorkoutRepository();

    WorkoutRepository createWorkoutRepository(String username);

    UserRepository createUserRepository();
}
