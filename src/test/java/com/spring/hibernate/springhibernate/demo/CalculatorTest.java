package com.spring.hibernate.springhibernate.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculatorTest {

    private final  Calculator cal = new Calculator();

    int a, b;


    @BeforeEach
    void setUp(){
        /**
         * Pre-condition
         */
        a = 10;
        b = 20;
    }

    @Test
     void add() {
        /**
         * Arrange  : Do the actual method invocation ( Calling production method )
         */

        /**
         * Act  : Do the actual method invocation ( Calling production method )
         */

        int sum = cal.add(a, b);

        /**
         * Assert : Check the result ( your response from production method
         */
        assertEquals(30, sum);

    }

    @Test
    void addTest() {


        /**
         * Act  : Do the actual method invocation ( Calling production method )
         */

        int sum = cal.add(a, b);

        /**
         * Assert : Check the result ( your response from production method
         */
        assertEquals(30, sum);

    }

    @AfterEach
    void tearDown(){
        /**
         * Post condition
         */
       // logic goes here
    }
}
