package WebWorkout.project.service;

import WebWorkout.project.exception.InvalidEntityDataException;
import WebWorkout.project.exception.NoneexistingEntityException;
import WebWorkout.project.model.Player;

import java.util.Collection;

public interface PlayerService {

    Collection<Player> getAllPlayers();

    Player getPlayerById(Player id) throws NoneexistingEntityException;
    Player addPlayer(Player workout) throws InvalidEntityDataException;
    Player updatePlayer(Player workout) throws NoneexistingEntityException, InvalidEntityDataException;
    Player deletePlayerById(Long id) throws NoneexistingEntityException;

    long count();
}
