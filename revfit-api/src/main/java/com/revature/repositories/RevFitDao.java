package com.revature.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Bear;

public interface RevFitDao extends JpaRepository<Bear, Integer>{

}
