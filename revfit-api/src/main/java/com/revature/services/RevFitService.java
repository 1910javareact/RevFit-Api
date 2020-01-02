package com.revature.services;

import java.util.List;

import com.revature.models.Bear;

public interface RevFitService {

	Bear findBearById(int id);

	List<Bear> getAllBears();

}
