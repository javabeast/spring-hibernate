package com.spring.hibernate.springhibernate.config;

public class CommonUtil {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a > b ? a - b : b - a;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
