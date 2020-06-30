package com.spring.hibernate.springhibernate.dao;

import com.spring.hibernate.springhibernate.domain.Country;

import java.util.List;

public interface CountryDao {

    List<Country> get();

    Country get(int id);

    void save(Country country);

    void delete(int id);
}
