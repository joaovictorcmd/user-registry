package model.service;

import model.dao.UserDAO;
import model.domain.User;

import java.util.List;

public class UserService {

    private final UserDAO dao = new UserDAO();

    public boolean register(String name, String lastName, Long phone, String email) {
        if (dao.existsPerEmail(email)) {
            return false;
        }

        dao.save(
                new User(name, lastName, phone, email)
        );
        return true;
    }

    public List<User> listUsers() {
        return dao.showUsers();
    }
}
