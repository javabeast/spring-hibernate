package com.spring.hibernate.springhibernate.config;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CommonUtilTest {

    private  final CommonUtil commonUtil = new CommonUtil();

    @Test
    @DisplayName("add two number")
    void addTest() {
        int a = 10;
        int b = 20;

        int sum = commonUtil.add(a, b);
        assertEquals(30, sum);
        assertEquals(30, sum, "The optional failure message is now the last parameter");
        assertTrue(a < b, () -> "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
        assertThat(sum, is(equalTo(30)));
    }
}