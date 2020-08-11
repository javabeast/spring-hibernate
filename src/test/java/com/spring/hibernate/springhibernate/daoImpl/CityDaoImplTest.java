package com.spring.hibernate.springhibernate.daoImpl;

import com.spring.hibernate.springhibernate.dao.CityDao;
import com.spring.hibernate.springhibernate.domain.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CityDaoImplTest {

    @Mock
    private CityDao cityDao;

    @Mock
    private EntityManager entityManager;


    @BeforeEach
    void setUp() {
       // do nothing
    }

    @Test
    void testGetAllCity() {
        List<City> cityList = new ArrayList<>();
        cityList.add(buildCityObject());

        when(cityDao.get()).thenReturn(cityList);

        assertEquals(cityDao.get(), cityList);
    }

    @Test
    void testGetCityById() {
    }

    @Test
    void testSave() {
    }

    @Test
    void testDelete() {
    }

    private City buildCityObject(){
        City city = new City();
        city.setName("INDIA");
        city.setCountryCode("IN");
        city.setDistrict("BANGALORE");
        city.setPopulation(130000000);
        return city;
    }
}