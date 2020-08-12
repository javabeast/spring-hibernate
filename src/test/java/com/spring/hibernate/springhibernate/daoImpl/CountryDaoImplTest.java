package com.spring.hibernate.springhibernate.daoImpl;


import com.spring.hibernate.springhibernate.domain.Country;
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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CountryDaoImplTest {

    @InjectMocks
    private CountryDaoImpl countryDaoImpl;

    @Mock
    private EntityManager entityManager;

    @Mock
    private Session session;

    @BeforeEach
    void setUp(){
       when(entityManager.unwrap(Session.class)).thenReturn(session);
    }

    @Test
    void testGetALlCountry(){
        List<Country> expectedCountryList = new ArrayList<>();
        expectedCountryList.add(buildCountryObject());

        Query<Country> countryQuery = mock(Query.class);
        when(session.createQuery("from Country", Country.class)).thenReturn(countryQuery);
        when(countryQuery.getResultList()).thenReturn(expectedCountryList);

        List<Country> actulCountryList = countryDaoImpl.get();
        assertNotNull(actulCountryList);
        assertEquals(expectedCountryList, actulCountryList);
        assertEquals(expectedCountryList.size(), actulCountryList.size());
    }

    private Country buildCountryObject(){
        Country country = new Country();
        country.setName("Aruba");
        country.setContinent("North America");
        country.setRegion("Caribbean");
        return country;
    }
}
