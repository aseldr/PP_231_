package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    void save(User user);
    User getById(Long id);
    void delete(Long id);
}