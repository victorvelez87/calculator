package com.sanitas.calculator.app.services;

import org.springframework.stereotype.Service;

import io.corp.calculator.TracerImpl;

/**
 * Servicio con herramientas útiles
 * @author victor
 *
 */
@Service
public class UtilsServiceImpl implements IUtilsService {

	@Override
	public void trace(String mensaje) {
		TracerImpl tracer = new TracerImpl();
		tracer.trace(mensaje);
	}

}
