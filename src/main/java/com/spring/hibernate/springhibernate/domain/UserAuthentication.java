package com.spring.hibernate.springhibernate.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@SuppressWarnings("ALL")
@Entity
@Table(name = "user_authenticate")
public class UserAuthentication {

    @Id
    @Column(name = "user_id")
    private int userId;

    @Column(name = "otp")
    private String opt;

    @Column(name = "insert_date")
    private Timestamp dateTime;

    @Column(name = "mobile_no")
    private String mobileNo;

    @Column(name = "is_valid")
    private int valid;
}
