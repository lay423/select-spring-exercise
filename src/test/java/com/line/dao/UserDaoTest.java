package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    @DisplayName("insert와 select가 잘 작동되는지 test")
    public void insertAndSelect() throws SQLException {

        //UserDao userDao = new UserDao();
        UserDao userDao = new UserDao();
        User user = new User("15", "king3", "11223");
        userDao.insert(user);

        User selectUser = userDao.select("15");
        Assertions.assertEquals("king3", selectUser.getName());
    }
}