package cn.javabs.service.impl;

import cn.javabs.dao.UserDao;
import cn.javabs.dao.impl.UserDaoImpl;
import cn.javabs.exception.AddUserException;
import cn.javabs.service.UserService;
import cn.javabs.entity.User;


public class UserServiceImpl implements UserService {

        UserDao userDao =new UserDaoImpl();
        public int addUser(User user) throws AddUserException {
                return userDao.addUser(user);
        }

}
