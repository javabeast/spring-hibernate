package com.spring.hibernate.springhibernate.service;

import com.spring.hibernate.springhibernate.domain.City;

import java.util.List;

public interface CityService {
    List<City> get();

    City get(int id);

    void save(City city);

    void delete(int id);
}
