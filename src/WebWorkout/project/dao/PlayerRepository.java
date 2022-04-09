package WebWorkout.project.dao;

import WebWorkout.project.model.Player;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Long, Player> {

    List<Player> findPlayersById(boolean ascending);

    long count();
}
