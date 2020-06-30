package com.spring.hibernate.springhibernate.controller;

import com.spring.hibernate.springhibernate.domain.Country;
import com.spring.hibernate.springhibernate.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("getAllCountry")
    public List<Country> getListOfCountry() {
        return countryService.get();
    }

}
