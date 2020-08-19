package com.spring.hibernate.springhibernate.serviceImpl;

import com.spring.hibernate.springhibernate.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceImplTest {

    @InjectMocks
    CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    @Mock
    CalculatorService calculatorService;

    @Test
    void add() {
        when(calculatorService.add(10.0, 20.0)).thenReturn(30.00);

        //test the add functionality
        assertEquals(calculatorServiceImpl.add(10.0, 20.0), 30.0, 0);
        assertEquals(calculatorServiceImpl.add(10.0, 20.0), 30.0, 0);

        /**
         * Mockito can ensure whether a mock method is being
         * called with required arguments or not. It is done using the verify() method
        */
        verify(calculatorService, times(2)).add(10.0, 20.0);
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
        when(calculatorService.divide(10.0, 05.0)).thenReturn(02.00);

        //test the add functionality
        assertEquals(calculatorServiceImpl.divide(10.0, 05.0), 02.00);
    }
}
