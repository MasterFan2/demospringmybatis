package com.masterfan.test.dao;

import com.masterfan.test.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User findUserById(long id);
}
