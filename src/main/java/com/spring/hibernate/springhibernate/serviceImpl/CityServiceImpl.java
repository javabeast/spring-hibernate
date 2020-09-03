package com.spring.hibernate.springhibernate.serviceImpl;

import com.spring.hibernate.springhibernate.dao.CityDao;
import com.spring.hibernate.springhibernate.domain.City;
import com.spring.hibernate.springhibernate.repository.CityRepository;
import com.spring.hibernate.springhibernate.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> get() {
        /*List<City> cityList = cityRepository.findCityByCode("AFG");
        return cityList;*/
        return cityDao.get();
    }

    @Override
    public City get(String name) {
        return cityDao.get(name);
    }

    @Override
    public void save(City city) {
        cityDao.save(city);
    }

    @Override
    public void delete(String cityCode) {
        cityDao.delete(cityCode);
    }
}
