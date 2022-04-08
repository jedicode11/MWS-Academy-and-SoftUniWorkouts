package WebWorkout.project.service;

import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Player;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface PlayerService {
    void loadDate();

    Collection<Player> getAllPlayers();
    List<Player> getAllPlayers(Comparator<Player> comp);
    List<Player> getAllPlayersByDate(boolean ascending);

    Player getPlayerById(Player id) throws NoneexistingEntityException;
    Player addPlayer(Player workout) throws InvalidEntityDataException;
    Player updatePlayer(Player workout) throws NoneexistingEntityException, InvalidEntityDataException;
    Player deletePlayerById(Long id) throws NoneexistingEntityException;

    long count();
    void loadData();
}
