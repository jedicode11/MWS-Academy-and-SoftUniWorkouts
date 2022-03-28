package WebWorkout.project.dao;

import WebWorkout.project.model.Workout;

import java.util.List;

public interface WorkoutRepository extends Repository<Long, Workout> {
    List<Workout> findAllSortedByDate(boolean ascending);
}
