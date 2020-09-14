package com.danish.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danish.model.SignUp;

@Repository
public interface SignUpDao extends JpaRepository<SignUp, Integer>
{

}
