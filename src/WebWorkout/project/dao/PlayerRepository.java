package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Player;
import WebWorkout.project.model.Workout;

public interface PlayerRepository extends Repository<Long, Player> {

    Workout create(Player entity);
    void update(Player entity) throws NoneexistingEntityException;
    Player deleteById(Player id) throws NoneexistingEntityException;
    long count();
}
