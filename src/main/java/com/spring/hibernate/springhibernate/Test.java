package com.spring.hibernate.springhibernate;

import java.sql.Timestamp;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        new Date(timestamp.getTime());
        System.out.println(timestamp);
    }
}
