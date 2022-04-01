package WebWorkout.project.dao;

import WebWorkout.project.model.User;

public interface UserRepository extends CrudRepository<Long, User> {
    User findByUsername(String username);
}
