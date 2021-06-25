package com.spring.hibernate.springhibernate.controller;

import com.spring.hibernate.springhibernate.service.AuthenticationService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/")
@RequestMapping
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("login")
    public @ResponseBody
    boolean login(@RequestBody String jsonObj) {
        JSONObject jsonObject = new JSONObject(jsonObj);
        String username = jsonObject.getString("username");
        String password = jsonObject.getString("password");
        return authenticationService.validation(username, password);
    }
}
