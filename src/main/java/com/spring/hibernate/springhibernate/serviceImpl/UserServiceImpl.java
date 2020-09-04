package com.spring.hibernate.springhibernate.serviceImpl;

import com.spring.hibernate.springhibernate.dao.UsersDao;
import com.spring.hibernate.springhibernate.domain.Users;
import com.spring.hibernate.springhibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersDao usersDao;

    @Override
    public List<Users> get() {
        return usersDao.get();
    }

    @Override
    public Users get(String userName) {
        return usersDao.get(userName);
    }

    @Override
    public void save(Users users) {

    }

    @Override
    public void delete(int id) {

    }
}
