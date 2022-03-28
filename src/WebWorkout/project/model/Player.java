package WebWorkout.project.model;

import java.util.ArrayList;
import java.util.List;

public class Player extends User {
    private List<String> assignedWorkouts = new ArrayList<>();
    private List<String> completedWorkoutsResults = new ArrayList<>();
    private List<String> favoriteWorkouts = new ArrayList<>();

    public Player(Long id, String firstName, String lastName, String username, String password, String email, String sports, Role role, int age, boolean active) {
        super(id, firstName, lastName, username, password, email, sports, role, age, active);
    }

    public List<String> getAssignedWorkouts() {
        return assignedWorkouts;
    }

    public void setAssignedWorkouts(List<String> assignedWorkouts) {
        this.assignedWorkouts = assignedWorkouts;
    }

    public List<String> getCompletedWorkoutsResults() {
        return completedWorkoutsResults;
    }

    public void setCompletedWorkoutsResults(List<String> completedWorkoutsResults) {
        this.completedWorkoutsResults = completedWorkoutsResults;
    }

    public List<String> getFavoriteWorkouts() {
        return favoriteWorkouts;
    }

    public void setFavoriteWorkouts(List<String> favoriteWorkouts) {
        this.favoriteWorkouts = favoriteWorkouts;
    }

    @Override
    public void dailyWorkout() {

    }


    // Start Workout "X" Time
    // Finish Workout "X" Time (LocalTime)
}
