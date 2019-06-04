package cn.javabs.service;
import cn.javabs.entity.User;
import cn.javabs.exception.AddUserException;

public interface UserService {
    int addUser(User user) throws AddUserException;
}
