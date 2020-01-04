package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.User;
import com.revature.repositories.RevFitDao;

@Service
public class RevsFitServiceImpl implements RevFitService{

	private RevFitDao rfd;
	
	@Autowired
	public RevsFitServiceImpl(RevFitDao rfd) {
		this.rfd = rfd;
	}

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return rfd.findByUsernameAndPassword(username, password);
	}

}
