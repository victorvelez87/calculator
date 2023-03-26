package com.sanitas.calculator.app.services;

import org.springframework.stereotype.Service;

/**
 * Servicio encargado de implementar las
 * operaciones aritméticas
 * @author victor
 *
 */
@Service
public class OperacionesServiceImpl implements IOperacionesService {

	/**
	 * Operación sumar dos operandos
	 */
	@Override
	public Double sumar(Double operador1, Double operador2) {
		return operador1 + operador2;
	}

	/**
	 * Operación restar dos operandos
	 */
	@Override
	public Double restar(Double minuendo, Double sustraendo) {
		return minuendo - sustraendo;
	}

}
