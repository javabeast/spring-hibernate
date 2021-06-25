package com.spring.hibernate.springhibernate.repository;

import com.spring.hibernate.springhibernate.domain.City;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true, propagation = Propagation.NEVER)
public interface CityRepository extends CrudRepository<City, String> {

    @Query(value = "select * from city where CountryCode = :code ", nativeQuery = true)
    List<City> findCityByCode(@Param("code") String code);
}

