package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Food;

public interface FoodDao extends JpaRepository<Food, Integer>{

	
}
