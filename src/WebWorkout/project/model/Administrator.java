package WebWorkout.project.model;

import static WebWorkout.project.model.Role.*;

public class Administrator extends User {
    private String email;
    private String results;

    public Administrator(Long id, String firstName, String lastName, String username, String password, String email, String sports, Role role, int age, boolean active) {
        super(id, firstName, lastName, username, password, email, sports, role, age, active);
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public void dailyWorkout() {

    }
}
