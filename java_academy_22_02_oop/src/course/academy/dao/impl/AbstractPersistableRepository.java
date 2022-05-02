package course.academy.dao.impl;

import course.academy.dao.IdGenerator;
import course.academy.dao.Identifiable;
import course.academy.dao.Repository;
import course.academy.exception.NoneexistingEntityException;

import java.util.*;

public abstract class AbstractPersistableRepository<K, V extends Identifiable<K>>
        implements Repository<K, V> {
    private Map<K, V> books = new HashMap<>(); // 0(1) find by ID
    private IdGenerator<K> idGenerator;

    public AbstractPersistableRepository(IdGenerator<K> idGenerator) {
        this.idGenerator = idGenerator;
    }

    @Override
    public Collection<V> findAll() {
        return books.values();
    }

    @Override
    public V findById(K id) {
        return books.get(id);
    }

//    @Override
//    public V findById(K id, Class<V> cls) {
//        try {
//            var field = cls.getDeclaredField("id");
//            field.setAccessible(true);
//            System.out.println(">>> private ID = " + field.get((V) books.get(id)));
//            var ctor = cls.getConstructor();
//            V obj = ctor.newInstance();
//            if (cls.isInstance(obj)) {
//                System.out.println(">>>> Is instance of " + cls.getSimpleName());
//            }
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//        return books.get(id);
//    }

    @Override
    public V create(V entity) {
        entity.setId(idGenerator.getNextId());
        books.put(entity.getId(), entity);
        return entity;
    }

    @Override
    public void addAll(Collection<V> entities) {
        for(var entity: entities) {
            books.put(entity.getId(), entity);
        }
    }

    @Override
    public void clear() {
        books.clear();
    }

    @Override
    public V update(V book) throws NoneexistingEntityException {
        V old = findById(book.getId());
        if(old == null) {
            throw new NoneexistingEntityException("Book with ID='"
                    + book.getId() + "' does not exist.");
        }
        books.put(book.getId(), book);
        return book;
    }

    @Override
    public V deleteById(K id) throws NoneexistingEntityException {
        V old = books.remove(id);
        if(old == null) {
            throw new NoneexistingEntityException("Book with ID='" + id + "' does not exist.");
        }
        return old;
    }

    @Override
    public long count() {
        return books.size();
    }

    public IdGenerator<K> getIdGenerator() {
        return idGenerator;
    }

    public void setIdGenerator(IdGenerator<K> idGenerator) {
        this.idGenerator = idGenerator;
    }

    public abstract void load();

    public abstract void save();
}




















