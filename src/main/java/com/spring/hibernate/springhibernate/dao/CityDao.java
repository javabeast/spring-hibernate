package com.spring.hibernate.springhibernate.dao;

import com.spring.hibernate.springhibernate.domain.City;

import java.util.List;

public interface CityDao {

    List<City> get();

    City get(String name);

    void save(City city);

    void delete(String name);
}
