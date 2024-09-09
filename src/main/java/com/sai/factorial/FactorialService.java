package com.sai.factorial;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {

    public int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
