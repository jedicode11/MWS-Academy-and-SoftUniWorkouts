package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

import java.util.Collection;

public interface Repository<K, V extends Identifiable<K>> {
    Collection<V> findAll();

    V findById(K id);

    Workout create(V entity);
    void update(V entity) throws NoneexistingEntityException;
    void deleteById(K id) throws NoneexistingEntityException;
    long count();

}
