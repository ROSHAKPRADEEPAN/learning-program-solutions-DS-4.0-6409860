/*Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and
Teardown Methods in JUnit 
 */

package com.example.calculator_test;
import com.example.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest2 {

    private Calculator2 calculator;

    // Setup method - runs BEFORE each test
    @Before
    public void setUp() {
        calculator = new Calculator2();
        System.out.println("Setup: Calculator instance created");
    }

    // Tear down method - runs AFTER each test
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown: Calculator instance destroyed");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 5;
        int b = 3;
        // Act
        int result = calculator.add(a, b);
        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int result = calculator.subtract(a, b);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        int a = 7;
        int b = 6;
        int result = calculator.multiply(a, b);
        assertEquals(42, result);
    }

    @Test
    public void testDivision() {
        int a = 12;
        int b = 4;
        int result = calculator.divide(a, b);
        assertEquals(3, result);
    }
}

