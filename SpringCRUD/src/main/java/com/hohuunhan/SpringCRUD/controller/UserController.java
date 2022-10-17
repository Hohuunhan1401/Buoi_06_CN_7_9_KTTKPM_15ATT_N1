package com.hohuunhan.SpringCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hohuunhan.SpringCRUD.entity.User;
import com.hohuunhan.SpringCRUD.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	Boolean createNewUser(@RequestBody User user) throws Exception {
		return userService.createUser(user);
	}

}
