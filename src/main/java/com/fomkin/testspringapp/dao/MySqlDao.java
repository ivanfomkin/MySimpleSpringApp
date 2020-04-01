package com.fomkin.testspringapp.dao;

import com.fomkin.testspringapp.entity.User;
import com.fomkin.testspringapp.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@RequiredArgsConstructor()
public class MySqlDao implements UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAllUsers() {
        String sql = "SELECT * from USER";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void save(User user) {
        String sql = "INSERT into user (name, email, age) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET name = ?, email = ?, age = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }
}
