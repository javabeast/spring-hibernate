package com.spring.hibernate.springhibernate.serviceImpl;

import com.spring.hibernate.springhibernate.dao.CountryDao;
import com.spring.hibernate.springhibernate.domain.Country;
import com.spring.hibernate.springhibernate.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDao countryDao;

    @Override
    public List<Country> get() {
        return countryDao.get();
    }

    @Override
    public Country get(int id) {
        return countryDao.get(id);
    }

    @Override
    public void save(Country country) {
        countryDao.save(country);
    }

    @Override
    public void delete(int id) {
        countryDao.delete(id);
    }
}
