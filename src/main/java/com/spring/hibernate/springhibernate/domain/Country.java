package com.spring.hibernate.springhibernate.domain;

import com.spring.hibernate.springhibernate.constant.Continent;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Country {

    @Id
    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column (name = "continent")
    private Continent continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "SurfaceArea")
    private float surfaceArea;

    @Column(name = "IndepYear")
    private int indepYear;

    @Column(name = "Population")
    private int population;

    @Column(name = "LifeExpectancy")
    private float lifeExpectancy;

    @Column(name = "GNP")
    private float gNP;

    @Column(name = "GNPOld")
    private float gNPOld;

    @Column(name = "LocalName")
    private String localName;

    @Column(name = "GovernmentForm")
    private String governmentForm;

    @Column(name = "HeadOfState")
    private String headOfState;

    @Column(name = "Capital")
    private int capital;

    @Column(name = "Code2")
    private String code2;

}
