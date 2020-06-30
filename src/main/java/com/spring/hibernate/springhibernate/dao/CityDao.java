package com.spring.hibernate.springhibernate.dao;

import com.spring.hibernate.springhibernate.domain.City;

import java.util.List;

public interface CityDao {

    List<City> get();

    City get(int id);

    void save(City city);

    void delete(int id);
}
