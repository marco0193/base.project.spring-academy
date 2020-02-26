package com.puntosingular.base.controller;

import java.util.HashMap;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntosingular.base.dto.UserDTO;
import com.puntosingular.base.models.User;
import com.puntosingular.base.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private final static Logger LOG = Logger.getLogger("com.puntosingular.base.controllers.UserController");
	
	@Autowired
	UserService userService;
	
	@GetMapping("getUsers")
	public ResponseEntity<?> getUsers(){
		Map<String, Object> response = new HashMap<>();
		
		if(userService.getUsers().isEmpty())
		{
			response.put("data","No hay usuarios registrados");
		}else {
			response.put("data", userService.getUsers());
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
		
		 //return userService.getUsers();
	}
	
	@GetMapping("getUserByName/{name}")
	public ResponseEntity<?> getUserByName(@PathVariable String name){
		Map<String, Object> response = new HashMap<>();
		
		UserDTO userDTO = userService.getUserByName(name);
		
		if(userDTO == null)
		{
			response.put("data","No hay usuarios registrados");
		}else {
			response.put("data", userDTO);
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("findByName/{name}")
	public ResponseEntity<?> findByName(@PathVariable String name){
		Map<String, Object> response = new HashMap<>();
		
		UserDTO userDTO = userService.findByName(name);
		
		if(userDTO == null)
		{
			response.put("data","No hay usuarios registrados");
		}else {
			response.put("data", userDTO);
		}
		
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("newUser")
	public ResponseEntity<?> newUser(@RequestBody User user ){
		Map<String, Object> response = new HashMap<>();
		
		userService.newUser(user);
		response.put("data","Se agrego un nuevo usuario");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.ACCEPTED);
		
		
	}
	
}