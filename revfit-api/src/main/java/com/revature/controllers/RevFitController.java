package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.User;
import com.revature.services.RevFitService;

@RestController
@RequestMapping("user")
public class RevFitController {
	
	private RevFitService rfs;
	
	@Autowired
	public RevFitController(RevFitService rfs) {
		this.rfs = rfs;
	}
	
	@GetMapping
	public List<User> getAllUsers(){
		return rfs.getAllUsers();
	}
}
