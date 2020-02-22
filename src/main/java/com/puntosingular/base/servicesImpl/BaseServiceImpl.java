package com.puntosingular.base.servicesImpl;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.puntosingular.base.services.BaseService;

@Service
public class BaseServiceImpl implements BaseService{

	private final static Logger LOG = Logger.getLogger("com.puntosingular.base.controller.BaseServiceImpl");
	
	
	@Override
	public ResponseEntity<?> getHolaMundo() {
		Map<String, Object> respuesta = new HashMap<>();
		
		LOG.info("Hola mundo desde spring boot");
		respuesta.put("respuesta", "Hola mundo desde spring boot - getHolaMundo - 202 aceptted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
	
}
