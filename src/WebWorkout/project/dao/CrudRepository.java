package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;

import java.util.Collection;

public interface CrudRepository<K, V extends Identifiable<K>> {
    Collection<V> findAll();

    void addAll(Collection<V> entity);
    void clear();
    V findById(K id);
    V create(V entity);
    V update(V entity) throws NoneexistingEntityException;
    V deleteById(K id) throws NoneexistingEntityException;
    long count();

    default V findById(K id, Class<V> cls) {
        System.out.println("Doing something with class " + cls.getSimpleName());
        return findById(id);
    }
}
