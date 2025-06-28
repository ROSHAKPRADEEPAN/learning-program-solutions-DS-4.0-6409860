//Exercise 1: Mocking and Stubbing 


package com.example.mockito_demo;


import static org.mockito.Mockito.*; 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyServiceTest {
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = mock(ExternalApi.class); // create mock object
        when(mockApi.getData()).thenReturn("Mock Data"); // stub method

        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        System.out.println("Fetched data: " + result);
        assertEquals("Mock Data", result);
    }
}

