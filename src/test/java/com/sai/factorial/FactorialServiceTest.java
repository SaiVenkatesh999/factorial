package com.sai.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactorialServiceTest {

    private FactorialService factorialService;

    @BeforeEach
    public void setUp() {
        factorialService = new FactorialService(); // Initialize the service before each test
    }

    @Test
    public void testFactorialOfZero() {
        int result = factorialService.calculateFactorial(0);
        assertEquals(1, result, "Factorial of 0 should be 1");
    }

    @Test
    public void testFactorialOfOne() {
        int result = factorialService.calculateFactorial(1);
        assertEquals(1, result, "Factorial of 1 should be 1");
    }

    @Test
    public void testFactorialOfFive() {
        int result = factorialService.calculateFactorial(5);
        assertEquals(120, result, "Factorial of 5 should be 120");
    }
}
