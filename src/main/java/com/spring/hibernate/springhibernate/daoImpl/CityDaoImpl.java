package com.spring.hibernate.springhibernate.daoImpl;

import com.spring.hibernate.springhibernate.dao.CityDao;
import com.spring.hibernate.springhibernate.domain.City;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CityDaoImpl implements CityDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<City> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<City> query = currentSession.createQuery("from City", City.class);
        List<City> list = query.getResultList();
        return list;
    }

    @Override
    public City get(String cityCode) {
        Session currentSession = entityManager.unwrap(Session.class);
        City cityObj = currentSession.get(City.class, cityCode);
        return cityObj;
    }

    @Override
    public void save(City city) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.save(city);
    }

    @Override
    public void delete(String cityCode) {
        Session currentSession = entityManager.unwrap(Session.class);
        City cityObj = currentSession.get(City.class, cityCode);
        currentSession.delete(cityObj);
    }
}
