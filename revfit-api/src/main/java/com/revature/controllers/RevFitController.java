package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Bear;
import com.revature.services.RevFitService;

@RestController
@RequestMapping("bears")
public class RevFitController {
	
	private RevFitService rfs;
	
	@Autowired
	public RevFitController(RevFitService rfs) {
		this.rfs = rfs;
	}
	
	@GetMapping
	public List<Bear> getAllBears(){
		return rfs.getAllBears();
	}
	
	@GetMapping("{id}")
	public Bear findBearById(@PathVariable int id) {
		return rfs.findBearById(id);
	}
}
