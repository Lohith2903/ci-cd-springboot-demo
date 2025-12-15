package com.example.demo;

import org.junit.jupiter.api.Test;

import com.example.demo.controller.HelloController;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {
	
	 @Test
	    void hello_shouldReturnExpectedMessage() {
	        HelloController controller = new HelloController();
	        String response = controller.hello();

	        assertEquals("CI/CD Pipeline Working!", response);
	    }
}
