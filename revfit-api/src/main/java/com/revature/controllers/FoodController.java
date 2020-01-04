package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Food;
import com.revature.services.FoodService;

@RestController
@RequestMapping("Food")
public class FoodController {

	private FoodService fs;
	
	@Autowired
	public FoodController(FoodService fs) {
		this.fs = fs;
	}
	
	@GetMapping
	public List<Food> getAllFood(){
		return fs.getAllFood();
	}
}
