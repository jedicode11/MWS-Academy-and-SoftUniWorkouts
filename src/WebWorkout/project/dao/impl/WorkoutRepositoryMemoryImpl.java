package WebWorkout.project.dao.impl;

import WebWorkout.project.dao.WorkoutRepository;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WorkoutRepositoryMemoryImpl implements WorkoutRepository {
    private Map<Long, Workout> workoutMap = new HashMap<>();

    @Override
    public Collection<Workout> findAll() {
        return workoutMap.values();
    }

    @Override
    public Workout findById(Long id) {
        return workoutMap.get(id);
    }

    @Override
    public Workout create(Workout entity) {
        entity.setId(entity.getId());
        workoutMap.put(entity.getId(),entity);
        return entity;
    }

    @Override
    public Workout update(Workout entity) throws NoneexistingEntityException {
        var old = findById(entity.getId());
        if(old == null) {
            throw new NoneexistingEntityException("Workout with ID='"
                    + entity.getId() + "' dose not exist.");
        }
        workoutMap.put(entity.getId(), entity);
        return old;
    }

    @Override
    public Workout deleteById(Workout id) throws NoneexistingEntityException {
        var old = workoutMap.remove(id);
        if(old == null) {
            throw new NoneexistingEntityException("Book with ID='" + id + "' does not exist.");
            }
        return deleteById(old);
    }


    @Override
    public void deleteById(Long id) throws NoneexistingEntityException {
    }

    @Override
    public long count() {
        workoutMap.values().size();
        return 0;
    }
}
