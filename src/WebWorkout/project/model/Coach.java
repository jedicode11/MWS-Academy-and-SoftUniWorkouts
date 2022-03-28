package WebWorkout.project.model;

import java.util.ArrayList;
import java.util.List;

public class Coach extends User {
    private List<String> dailyWorkouts = new ArrayList<>();
    private List<String> completedWorkoutsResults = new ArrayList<>();

    public Coach(Long id, String firstName, String lastName, String username, String password, String email, String sports, Role role, int age, boolean active) {
        super(id, firstName, lastName, username, password, email, sports, role, age, active);
    }

    public List<String> getDailyWorkouts() {
        return dailyWorkouts;
    }

    public void setDailyWorkouts(List<String> dailyWorkouts) {
        this.dailyWorkouts = dailyWorkouts;
    }

    public List<String> getCompletedWorkoutsResults() {
        return completedWorkoutsResults;
    }

    public void setCompletedWorkoutsResults(List<String> completedWorkoutsResults) {
        this.completedWorkoutsResults = completedWorkoutsResults;
    }

    @Override
    public void dailyWorkout() {

    }
}
