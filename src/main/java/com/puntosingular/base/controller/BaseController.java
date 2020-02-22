package com.puntosingular.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntosingular.base.services.BaseService;

@RestController
@RequestMapping("/base")
public class BaseController {

	private final static Logger LOG = Logger.getLogger("com.puntosingular.base.controller.BaseController");
	
	//Services
	@Autowired
	BaseService baseService;
	
	@GetMapping("holaMundo")
	public ResponseEntity<?> holaMundo(){
		Map<String, Object> respuesta = new HashMap<>();
		
		//LOG.info("Hola mundo desde spring boot");
		respuesta.put("respuesta", "Hola mundo desde spring boot - 202 aceptted");
		return new ResponseEntity<Map<String, Object>>(respuesta, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("getHolaMundo")
	public ResponseEntity<?> getHolaMundo(){
		return baseService.getHolaMundo();
	}
}
