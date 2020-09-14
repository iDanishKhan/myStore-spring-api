package com.danish.service;

import java.util.List;

import com.danish.model.SignUp;

public interface SignUpService {

	public SignUp addUser(SignUp signUp);

	public void deleteUser(int userId);

	public List<SignUp> getAllUsers();

}
