package main.java.com.joaovictorcmd.userregistry.model.dao;

import main.java.com.joaovictorcmd.userregistry.model.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private final List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> showUsers() {
        return users;
    }

    public boolean existsPerEmail(String email) {
        return users
                .stream()
                .anyMatch(
                        user -> user.getEmail().equalsIgnoreCase(email)
                );
    }
}
