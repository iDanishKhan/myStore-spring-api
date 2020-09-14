package com.danish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danish.model.SignUp;
import com.danish.service.SignUpService;

@RestController
@RequestMapping("/signup")
public class SignUpController 
{
	@Autowired
	private SignUpService signUpService;
	
	@GetMapping("/")
	public ResponseEntity<Object> getAllUsers()
	{
		List<SignUp> users = signUpService.getAllUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<SignUp> addUser(@RequestBody SignUp signUp)
	{
		SignUp signUps = signUpService.addUser(signUp);
		return new ResponseEntity<>(signUps, HttpStatus.CREATED);		
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable int userId)
	{
		signUpService.deleteUser(userId);
		return new ResponseEntity<>("Deleted Successfully!",HttpStatus.OK);		
	}
}
