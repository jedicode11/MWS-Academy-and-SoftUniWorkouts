package WebWorkout.project.dao;

import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Player;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Long, Player> {

    List<Player> findPlayersById(boolean ascending);

    Player create(Player entity);
    Player update(Player entity) throws NoneexistingEntityException;
    Player deleteById(Player id) throws NoneexistingEntityException;
    long count();
}
