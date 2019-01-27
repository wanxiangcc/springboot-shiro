package com.example.shiro.dao;

import com.example.shiro.po.User;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends BaseDao<User> {
    User findByUsername(String username);

    @Query(value = "select password from User where username = ?1")
    String getPassword(String username);
}
