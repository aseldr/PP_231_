package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.model.User;
import javax.transaction.Transactional;
import java.util.List;


@Repository
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User getById(Long id) {
        return userDAO.getById(id);
    }

    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }
}
