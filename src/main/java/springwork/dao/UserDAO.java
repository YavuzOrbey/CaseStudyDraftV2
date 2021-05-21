package springwork.dao;

import java.util.List;

import springwork.models.Role;
import springwork.models.User;

public interface UserDAO extends GenericDAO<User> {
    //UserEntity findById(int id);
    //void updateDatabase(UserEntity entity);
    User findByEmail(String email);
    List<User> findByRole(Role role);
}
