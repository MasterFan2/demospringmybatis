package com.masterfan.test.serivce;

import com.masterfan.test.dao.UserDao;
import com.masterfan.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(long id) {
        return userDao.findUserById(id);
    }
}
