package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

public interface WorkoutRepository extends CrudRepository<Long, Workout> {

    Workout create(Workout entity);
    Workout update(Workout entity) throws NoneexistingEntityException;
    Workout deleteById(Workout id) throws NoneexistingEntityException;
    long count();
}
