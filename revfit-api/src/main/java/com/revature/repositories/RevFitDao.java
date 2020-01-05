package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.User;

public interface RevFitDao extends JpaRepository<User, Integer>{

	User findByUsernameAndPassword(String username, String password);
}
