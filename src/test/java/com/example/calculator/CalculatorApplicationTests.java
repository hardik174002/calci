package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(2 + 2 == 4);
	}

	@Test
	void sampleTest() {	
		assertTrue(1 + 1 == 2);
	}
	// Comment added for testing
}
