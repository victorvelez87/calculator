package com.sanitas.calculator.app.services;

/**
 * Interfaz que define las posibles operaciones aritméticas
 * @author victor
 *
 */
public interface IOperacionesService {
	
	public Double sumar(Double operador1, Double operador2);
	
	public Double restar(Double minuendo, Double sustraendo);
}
