package com.spring.hibernate.springhibernate.serviceImpl;

import com.spring.hibernate.springhibernate.domain.Users;
import com.spring.hibernate.springhibernate.service.AuthenticationService;
import com.spring.hibernate.springhibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    @Autowired
    private UserService userService;

    @Override
    public boolean validation(String userName, String password) {
        Users users = userService.get(userName);
        if (users != null && users.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
