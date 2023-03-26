package com.sanitas.calculator.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sanitas.calculator.app.services.IOperacionesService;
import com.sanitas.calculator.app.services.IUtilsService;

/**
 * Controller que recibe las peticiones de 
 * cada una de las distintas operaciones aritméticas
 * @author victor
 *
 */
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	
	@Autowired
	private IOperacionesService operacionesService;
	
	@Autowired
	private IUtilsService utilsService;

	@GetMapping("/sumar")
	public ResponseEntity<String> sumando(@RequestParam(name = "operando1") Double operando1, 
			@RequestParam(name = "operando2") Double operando2) {
		
		Double result = operacionesService.sumar(operando1, operando2);		
		
		utilsService.trace(result.toString());
		
		return ResponseEntity.status(HttpStatus.OK).body(result.toString());
	}
	
	@GetMapping("/restar")
	public ResponseEntity<String> restando(@RequestParam(name = "minuendo") Double minuendo, 
			@RequestParam(name = "sustraendo") Double sustraendo) {
		
		Double result = operacionesService.restar(minuendo, sustraendo);
		
		utilsService.trace(result.toString());
		
		return ResponseEntity.status(HttpStatus.OK).body(result.toString());
	}
}
