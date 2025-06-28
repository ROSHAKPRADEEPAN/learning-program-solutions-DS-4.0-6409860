//Exercise 2: Verifying Interactions 


package com.example.mockito_demo;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class MyServiceTest2 {
 @Test
 public void testVerifyInteraction() {
 ExternalApi mockApi = Mockito.mock(ExternalApi.class);
 MyService service = new MyService(mockApi);
 service.fetchData();
 verify(mockApi).getData();
 }
}
