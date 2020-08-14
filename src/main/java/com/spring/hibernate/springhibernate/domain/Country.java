package com.spring.hibernate.springhibernate.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@SuppressWarnings("JpaDataSourceORMInspection")
public class Country {

    @Id
    @Column(name = "Code", columnDefinition = "char")
    private String code;

    @Column(name = "Name", columnDefinition = "char")
    private String name;

    @Column (name = "continent", columnDefinition = "enum")
    private String continent;

    @Column(name = "Region", columnDefinition = "char")
    private String region;

    @Column(name = "SurfaceArea")
    private Float surfaceArea;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population")
    private Integer population;

    @Column(name = "LifeExpectancy")
    private Float lifeExpectancy;

    @Column(name = "GNP")
    private Float gNP;

    @Column(name = "GNPOld")
    private Float gNPOld;

    @Column(name = "LocalName", columnDefinition = "char")
    private String localName;

    @Column(name = "GovernmentForm", columnDefinition = "char")
    private String governmentForm;

    @Column(name = "HeadOfState", columnDefinition = "char")
    private String headOfState;

    @Column(name = "Capital")
    private Integer capital;

    @Column(name = "Code2", columnDefinition = "char")
    private String code2;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "Code")
    private Set<City> cities;

}
