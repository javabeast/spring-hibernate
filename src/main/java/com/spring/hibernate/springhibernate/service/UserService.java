package com.spring.hibernate.springhibernate.service;

import com.spring.hibernate.springhibernate.domain.Users;

import java.util.List;

public interface UserService {

    List<Users> get();

    Users get(String userName);

    void save(Users users);

    void delete(int id);
}
