package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Coach;

public interface CoachRepository extends CrudRepository<Long, Coach> {

    // create coach
    Coach create(Coach entity);
    Coach update(Coach entity) throws NoneexistingEntityException;
    Coach deleteById(Coach id) throws NoneexistingEntityException;
    long count();
}
