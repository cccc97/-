package cn.javabs.dao;

import cn.javabs.entity.User;
import cn.javabs.exception.AddUserException;

public interface UserDao {
        int addUser(User user) throws AddUserException, AddUserException;
}
