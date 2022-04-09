package webworkout.project.service;

import webworkout.project.dao.CoachRepository;
import webworkout.project.exception.InvalidEntityDataException;
import webworkout.project.exception.NoneexistingEntityException;
import webworkout.project.model.Player;

public class CoachServiceImpl implements CoachService {
    private final CoachRepository coachRepository;

    public CoachServiceImpl(CoachRepository coachRepository) {
        this.coachRepository = coachRepository;
    }

    @Override
    public Player getPlayerById(Player id) throws NoneexistingEntityException {
        return null;
    }

    @Override
    public Player addPlayer(Player workout) throws InvalidEntityDataException {
        return null;
    }

    @Override
    public Player updatePlayer(Player workout) throws NoneexistingEntityException, InvalidEntityDataException {
        return null;
    }

    @Override
    public Player deletePlayerById(Long id) throws NoneexistingEntityException {
        return null;
    }
}
