package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Coach;
import WebWorkout.project.model.Workout;

public interface CoachRepository extends Repository<Long, Coach> {

    // create coach
    Coach create(Coach entity);
    void update(Coach entity) throws NoneexistingEntityException;
    Coach deleteById(Coach id) throws NoneexistingEntityException;
    long count();
}
