package com.spring.hibernate.springhibernate.daoImpl;

import com.spring.hibernate.springhibernate.domain.City;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CityDaoImplTest {

    @InjectMocks
    private CityDaoImpl cityDaoImpl;

    @Mock
    private Session session;

    @Mock
    private EntityManager entityManager;


    @BeforeEach
    void setUp() {
        lenient().when(entityManager.unwrap(Session.class)).thenReturn(session);
    }

    @Test
    void testGetAllCity() {
        List<City> cityList = new ArrayList<>();
        cityList.add(buildCityObject());

        Query<City> cityQuery = mock(Query.class);
        when(session.createQuery("from City", City.class)).thenReturn(cityQuery);
        when(cityQuery.getResultList()).thenReturn(cityList);

        List<City> actualList = cityDaoImpl.get();
        assertNotNull(actualList);
        assertEquals(cityList, actualList);
        assertEquals(cityList.size(), actualList.size());

    }

    @Test
    void testGetCityById() {
        //do nothing
    }

    @Test
    void testSave() {
        //do nothing
    }

    @Test
    void testDelete() {
        //do nothing
    }

    private City buildCityObject(){
        City city = new City();
        city.setName("INDIA");
        city.setCode("IN");
        city.setDistrict("BANGALORE");
        city.setPopulation(130000000);
        return city;
    }
}

