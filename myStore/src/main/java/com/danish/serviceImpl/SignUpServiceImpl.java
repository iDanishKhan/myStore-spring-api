package com.danish.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danish.dao.SignUpDao;
import com.danish.model.SignUp;
import com.danish.service.SignUpService;

@Service
@Transactional
public class SignUpServiceImpl implements SignUpService
{
	@Autowired
	private SignUpDao signUpDao;
	
	@Override
	public SignUp addUser(SignUp signUp) {
		SignUp signUpObj = signUpDao.save(signUp);
		return signUpObj;
	}

	@Override
	public void deleteUser(int userId) {
		signUpDao.deleteById(userId);		
	}

	@Override
	public List<SignUp> getAllUsers() {
		return signUpDao.findAll();
	}
}
