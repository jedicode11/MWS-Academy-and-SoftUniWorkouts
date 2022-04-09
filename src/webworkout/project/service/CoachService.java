package webworkout.project.service;

import webworkout.project.exception.InvalidEntityDataException;
import webworkout.project.exception.NoneexistingEntityException;
import webworkout.project.model.Player;

public interface CoachService {

    Player getPlayerById(Player id) throws NoneexistingEntityException;
    Player addPlayer(Player workout) throws InvalidEntityDataException;
    Player updatePlayer(Player workout) throws NoneexistingEntityException, InvalidEntityDataException;
    Player deletePlayerById(Long id) throws NoneexistingEntityException;
}
