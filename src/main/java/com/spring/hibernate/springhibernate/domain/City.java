package com.spring.hibernate.springhibernate.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@SuppressWarnings("ALL")
@Entity
@Getter
@Setter
public class City {

    @Column(name = "Name", columnDefinition = "char")
    private String name;

    @Id
    @Column(name = "Code", columnDefinition = "char", nullable=false)
    private String code;

    @Column(name = "District", columnDefinition = "char")
    private String district;

    @Column(name = "Population")
    private int population;

}
