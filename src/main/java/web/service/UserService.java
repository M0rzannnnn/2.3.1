package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add (User user);

    void update (Long id, User updatedUser);

    void delete (Long id);

    List<User> getAll ();

    User show (Long id);
}
