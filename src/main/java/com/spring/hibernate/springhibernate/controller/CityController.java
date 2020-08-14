package com.spring.hibernate.springhibernate.controller;

import com.spring.hibernate.springhibernate.domain.City;
import com.spring.hibernate.springhibernate.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/getallcity")
    public List<City> get(){
        return cityService.get();
    }

    @GetMapping("/getcitybyname/{name}")
    public City getCityByCode(@PathVariable("name") String name){
        return cityService.get(name);
    }
}
