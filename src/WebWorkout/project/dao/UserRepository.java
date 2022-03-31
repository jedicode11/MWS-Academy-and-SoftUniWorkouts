package WebWorkout.project.dao;

import WebWorkout.project.model.User;

public interface UserRepository extends Repository<Long, User> {
    User findByUsername(String username);
}
