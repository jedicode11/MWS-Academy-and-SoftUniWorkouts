package WebWorkout.project.dao.impl;

import WebWorkout.project.dao.WorkoutRepository;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Workout;

import java.util.*;

public class WorkoutRepositoryMemoryImpl implements WorkoutRepository {
    private Map<Long, Workout> workoutsByDate = new HashMap<>();


    @Override
    public Collection<Workout> findAll() {
        return workoutsByDate.values();
    }

    @Override
    public void addAll(Collection<Workout> entity) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Workout findById(Long id) {
        return workoutsByDate.get(id);
    }

    @Override
    public Workout create(Workout entity) {
        entity.setId(entity.getId());
        workoutsByDate.put(entity.getId(),entity);
        return entity;
    }

    @Override
    public Workout update(Workout entity) throws NoneexistingEntityException {
        var old = findById(entity.getId());
        if(old == null) {
            throw new NoneexistingEntityException("Workout with ID='"
                    + entity.getId() + "' dose not exist.");
        }
        workoutsByDate.put(entity.getId(), entity);
        return old;
    }

    @Override
    public Workout deleteById(Workout id) throws NoneexistingEntityException {
        var old = workoutsByDate.remove(id);
        if(old == null) {
            throw new NoneexistingEntityException("Workout with ID='" + id + "' does not exist.");
        }
        return deleteById(old);
    }


    @Override
    public Workout deleteById(Long id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public long count() {
        workoutsByDate.values().size();
        return 0;
    }

    @Override
    public void load() {

    }

    @Override
    public void save() {

    }

    @Override
    public Workout findById(Long id, Class<Workout> cls) {
        return null;
    }

    @Override
    public List<Workout> findALlSortedByDate(boolean ascending) {
        return null;
    }

    @Override
    public List<Workout> findAllSortedByDate(boolean ascending) {
            var valuesMap =  workoutsByDate;
            if(!ascending) {
                valuesMap = (Map<Long, Workout>) valuesMap.values();
            }
            System.out.println("Workouts.findAllSorted() called.");
            List<Workout> results = new ArrayList<>();
            for(Workout listByDate: valuesMap.values()){
                results.addAll((Collection<? extends Workout>) listByDate);
            }
            return results;
        }
    }
