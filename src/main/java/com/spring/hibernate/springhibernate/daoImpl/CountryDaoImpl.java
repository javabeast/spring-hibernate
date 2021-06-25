package com.spring.hibernate.springhibernate.daoImpl;

import com.spring.hibernate.springhibernate.dao.CountryDao;
import com.spring.hibernate.springhibernate.domain.Country;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class CountryDaoImpl implements CountryDao {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Country> get() {
        Session session = entityManager.unwrap(Session.class);
        Query<Country> countryQuery = session.createQuery("from Country where Code='NLD'", Country.class);
        List<Country> countryList = countryQuery.getResultList();
        return countryList;
    }

    @Override
    public Country get(int id) {
        return null;
    }

    @Override
    public void save(Country country) {

    }

    @Override
    public void delete(int id) {

    }
}
