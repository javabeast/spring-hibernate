package com.spring.hibernate.springhibernate.controller;

import com.spring.hibernate.springhibernate.domain.Users;
import com.spring.hibernate.springhibernate.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/")
@RequestMapping
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public @ResponseBody
    boolean login(@RequestBody String jsonObj) {
        JSONObject jsonObject = new JSONObject(jsonObj);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        Users users = userService.get(username);
        /**
         * Here you will have one more service call i.e. authentication service
         * which will validate input coming from front-end
         * data coming from database
         */
        return users != null ? true : false;
    }
}
