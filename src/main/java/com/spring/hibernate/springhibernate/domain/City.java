package com.spring.hibernate.springhibernate.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@SuppressWarnings("ALL")
@Entity
@Getter
@Setter
public class City {

    @Id
    @Column
    private int Id;

    @Column(name = "Name")
    private String name;

    @Column(name = "CountryCode")
    private String countryCode;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private int population;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "CountryCode", referencedColumnName="Code")
    private Country country;

}
