package springwork.dao;


import java.util.List;

import springwork.models.Role;
import springwork.models.User;

public interface RoleDAO extends GenericDAO<Role> {
    void assignRoleToUser(Role role, User user) throws Exception;
    void assignRoleToUsers(Role role, List<User> users);
}
