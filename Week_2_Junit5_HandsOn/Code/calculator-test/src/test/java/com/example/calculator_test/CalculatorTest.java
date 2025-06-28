//Exercise 1: Setting Up JUnit 

package com.example.calculator_test;
import org.junit.Test;
import com.example.Calculator;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3)); 
        assertEquals(6, calc.add(2, 3));  // will throw an error
    }
}

