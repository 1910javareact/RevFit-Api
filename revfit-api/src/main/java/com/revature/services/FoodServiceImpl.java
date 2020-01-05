package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Food;
import com.revature.repositories.FoodDao;

@Service
public class FoodServiceImpl implements FoodService{
	
	private FoodDao fd;
	
	@Autowired
	public FoodServiceImpl(FoodDao fd) {
		this.fd = fd;
	}

	@Override
	public List<Food> getAllFood() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}

}
