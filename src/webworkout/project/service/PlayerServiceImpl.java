package webworkout.project.service;

import webworkout.project.dao.PlayerRepository;
import webworkout.project.exception.InvalidEntityDataException;
import webworkout.project.exception.NoneexistingEntityException;
import webworkout.project.model.Player;

import java.util.Collection;

public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Collection<Player> getAllPlayers() {
        return null;
    }

    @Override
    public Player getPlayerById(Player id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public Player addPlayer(Player workout) throws InvalidEntityDataException {
        return playerRepository.create(workout);
    }

    @Override
    public Player updatePlayer(Player workout) throws NoneexistingEntityException, InvalidEntityDataException {
        return null;
    }

    @Override
    public Player deletePlayerById(Long id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
