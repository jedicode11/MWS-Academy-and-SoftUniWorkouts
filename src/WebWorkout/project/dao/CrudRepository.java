package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;

import java.util.Collection;

public interface CrudRepository<K, V extends Identifiable<K>> {
    Collection<V> findAll();

    V findById(K id);
    V create(V entity);
    V update(V entity) throws NoneexistingEntityException;
    void deleteById(K id) throws NoneexistingEntityException;
    long count();

}
