package com.fomkin.testspringapp.dao;

import com.fomkin.testspringapp.entity.User;

import java.util.List;

public interface UserDao {
    List<User> findAllUsers();
    User getById(int id);
    void delete(int id);
    void save(User user);
    void update(User user);
}
