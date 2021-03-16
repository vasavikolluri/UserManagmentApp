package com.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.model.UserAccount;
import com.ashokit.userService.UserManagementService;

@RestController
public class UserRegistrationController {
	@Autowired
	UserManagementService service;
  
	@GetMapping("/countries")
	public Map<Integer, String> getContries()
	{
		return service.getCountries();
	}
	@GetMapping("/states/{countryId}")
	public Map<Integer, String> getStates(@PathVariable Integer countryId)
	{
		return service.getStates(countryId);
	}
	
	@GetMapping("/city/{stateId}")
	public Map<Integer, String> getCity(@PathVariable Integer stateId)
	{
		return service.getStates(stateId);
	}
	@GetMapping("/emailCheck/{email}")
	public String  emailCheck(@PathVariable String email)
	{
		boolean isUnique=service.isEmailUnique(email);
		if(isUnique)
		{
			return "UNIQUE";
		}
       return "DULPLICATE";
	}
	@PostMapping("/saveUser")
	public ResponseEntity<String> registerUser(@RequestBody UserAccount userAc)
	{
		boolean isSaved=service.saveUser(userAc);
		if(isSaved)
		{
			return new ResponseEntity<>("Registration Successfully",HttpStatus.CREATED);
		}
		return new ResponseEntity<>("Registration failed",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
