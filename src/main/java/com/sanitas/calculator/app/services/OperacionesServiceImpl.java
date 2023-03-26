package com.sanitas.calculator.app.services;

import org.springframework.stereotype.Service;

@Service
public class OperacionesServiceImpl implements IOperacionesService {

	@Override
	public Double sumar(Double operador1, Double operador2) {
		return operador1 + operador2;
	}

	@Override
	public Double restar(Double minuendo, Double sustraendo) {
		return minuendo - sustraendo;
	}

}
