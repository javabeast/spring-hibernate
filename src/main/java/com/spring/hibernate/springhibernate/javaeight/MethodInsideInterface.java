package com.spring.hibernate.springhibernate.javaeight;

public interface MethodInsideInterface {

    default int addTwoNumber(int a, int b){
        return a + b;
    }
}
