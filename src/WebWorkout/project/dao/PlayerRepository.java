package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Player;

public interface PlayerRepository extends CrudRepository<Long, Player> {

    Player create(Player entity);
    Player update(Player entity) throws NoneexistingEntityException;
    Player deleteById(Player id) throws NoneexistingEntityException;
    long count();
}
