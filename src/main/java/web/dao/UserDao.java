package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {


    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    User getUser(long id);

    void editUser(User user, Long id);
}