package course.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Reader extends User {
    private List<String> favoriteBlogs = new ArrayList<>();

    public Reader(Long id, String firstName, String lastName, int age, String username, String password, List<String> favouriteBlogs) {
        super(id, firstName, lastName, age, username, password, Role.READER, true);
        this.favoriteBlogs = favouriteBlogs;
    }

    public List<String> getFavoriteBlogs() {
        return favoriteBlogs;
    }

    public void setFavoriteBlogs(List<String> favoriteBlogs) {
        this.favoriteBlogs = favoriteBlogs;
    }

    @Override
    public String toString() {
        return "Reader{" + super.toString() +
                " | favouriteBlogs=" + favoriteBlogs + "}";
    }
}