package WebWorkout.project.dao;

import WebWorkout.project.model.Workout;

public interface Identifiable<K> {
    K getId();
    void setId(K id);
}
