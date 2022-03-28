package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;

import java.util.Collection;

public interface Repository<Workout, V extends Identifiable<Workout>> {
    Collection<V> findAll();

    V findById(Workout id);
    default V findById(Workout id, Class<V> cls) {
        System.out.println("Doing something with class " + cls.getSimpleName());
        return findById(id);
    }

    V create(V entity);
    V update(V entity) throws NoneexistingEntityException;
    V deleteById(Workout id) throws NoneexistingEntityException;
    long count();

}
