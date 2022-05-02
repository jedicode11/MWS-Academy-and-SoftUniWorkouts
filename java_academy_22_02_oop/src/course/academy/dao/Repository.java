package course.academy.dao;

import course.academy.exception.NoneexistingEntityException;

import java.util.Collection;

public interface Repository<K, V extends Identifiable<K>> {

    /**
     * Find all users in repository
     * @return array of all users
     */
    Collection<V> findAll();

    /**
     * Find user by id
     * @param id the entity id
     * @return the user with given id, or null if id not found in repository
     */


    V findById(K id);
    default V findById(K id, Class<V> cls) {
        System.out.println("Doing something with class " + cls.getSimpleName());
        return findById(id);
    }

    V create(V entity);
    void addAll(Collection<V> entity);
    void clear();
    V update(V entity) throws NoneexistingEntityException;
    V deleteById(K id) throws NoneexistingEntityException;
    long count();
}
