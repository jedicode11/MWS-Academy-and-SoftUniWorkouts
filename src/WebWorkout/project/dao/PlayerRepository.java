package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Player;

public interface PlayerRepository extends Repository<Long, Player> {

    Player create(Player entity);
    void update(Player entity) throws NoneexistingEntityException;
    Player deleteById(Player id) throws NoneexistingEntityException;
    long count();
}
