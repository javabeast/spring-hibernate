package com.spring.hibernate.springhibernate.dao;

import com.spring.hibernate.springhibernate.domain.Users;

import java.util.List;

public interface UsersDao {
    List<Users> get();

    Users get(String userName);

    void save(Users users);

    void delete(int id);
}
