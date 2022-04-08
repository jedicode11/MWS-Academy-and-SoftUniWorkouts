package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

import java.util.List;


public interface WorkoutRepository extends CrudRepository<Long, Workout> {

    Workout create(Workout entity);
    Workout update(Workout entity) throws NoneexistingEntityException;
    Workout deleteById(Workout id) throws NoneexistingEntityException;

    void load();

    void save();

    List<Workout> findALlSortedByDate(boolean ascending);

    List<Workout> findAllSortedByDate(boolean ascending);
}
