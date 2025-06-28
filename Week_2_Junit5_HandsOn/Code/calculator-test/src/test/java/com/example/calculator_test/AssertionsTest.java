//Exercise 3: Assertions in JUnit 


package com.example.calculator_test;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testSimpleAssertions() {
        assertEquals("Sum should be 5", 5, 2 + 3);
        assertNotEquals("Should not be equal", 4, 2 + 3);
        assertTrue("5 is greater than 3", 5 > 3);
        assertFalse("3 is not greater than 5", 3 > 5);
        assertNull("This should be null", null);
        assertNotNull("This should not be null", "Hello");
    }
}
