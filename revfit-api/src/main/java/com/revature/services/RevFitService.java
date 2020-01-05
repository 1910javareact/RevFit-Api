package com.revature.services;

import com.revature.models.User;

public interface RevFitService {

	User findByUsernameAndPassword(String username, String password);

	User saveOneUser(User u);
}
