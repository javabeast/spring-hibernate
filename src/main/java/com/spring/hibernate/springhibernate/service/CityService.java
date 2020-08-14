package com.spring.hibernate.springhibernate.service;

import com.spring.hibernate.springhibernate.domain.City;

import java.util.List;

public interface CityService {
    List<City> get();

    City get(String name);

    void save(City city);

    void delete(String name);
}
