package com.sanitas.calculator.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sanitas.calculator.app.services.IOperacionesService;

@SpringBootTest
class CalculatorApplicationTests {

	@Autowired
	IOperacionesService operacionesService;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void testOperacionesSumar() {
		Double result = operacionesService.sumar(Double.parseDouble("3.5"), Double.parseDouble("1.5"));
		Assertions.assertEquals(result, Double.parseDouble("5.0"));
	}
	
	@Test
	void testOperacionesRestar() {
		Double result = operacionesService.restar(Double.parseDouble("3.5"), Double.parseDouble("1.5"));
		Assertions.assertEquals(result, Double.parseDouble("2.0"));
	}

}
