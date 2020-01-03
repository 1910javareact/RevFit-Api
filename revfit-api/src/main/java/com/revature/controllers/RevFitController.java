package com.revature.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("login")
	public User login(String username, String password, HttpServletRequest req) {
		User u = rfs.findByUsernameAndPassword(username, password);
		req.getSession().setAttribute("user", u);
		return u;
	}
}
