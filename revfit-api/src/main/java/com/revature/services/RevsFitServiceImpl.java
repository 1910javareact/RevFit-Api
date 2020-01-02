package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Bear;
import com.revature.repositories.RevFitDao;

@Service
public class RevsFitServiceImpl implements RevFitService{

	private RevFitDao rfd;
	
	@Autowired
	public RevsFitServiceImpl(RevFitDao rfd) {
		this.rfd = rfd;
	}
	
	@Override
	public Bear findBearById(int id) {
		// TODO Auto-generated method stub
		return rfd.getOne(id);
	}

	@Override
	public List<Bear> getAllBears() {
		// TODO Auto-generated method stub
		return rfd.findAll();
	}

}
