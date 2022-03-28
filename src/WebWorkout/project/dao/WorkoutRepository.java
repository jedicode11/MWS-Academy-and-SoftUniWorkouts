package WebWorkout.project.dao;

import WebWorkout.project.model.Workout;

import java.awt.print.Book;
import java.util.List;

public interface WorkoutRepository extends Repository<Long, Workout> {
    List<Book> findAllSortedByDate(boolean ascending);
}
