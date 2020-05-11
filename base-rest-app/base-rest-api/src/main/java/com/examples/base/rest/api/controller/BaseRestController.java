package com.examples.base.rest.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.base.rest.api.mapper.Mapper;
import com.examples.base.rest.api.model.User;
import com.examples.base.rest.business.model.UserB;
import com.examples.base.rest.business.service.ExampleService;

@RestController
public class BaseRestController {

	@Autowired
	private ExampleService exampleService;

	@Autowired
	private Mapper mapper;

	@GetMapping("/users")
	public List<User> findAll() {

		List<UserB> usersB = exampleService.findAll();
		List<User> users = new ArrayList<User>();
		for (UserB userB : usersB) {
			users.add(mapper.map(userB, User.class));
		}
		return users;
	}

	@PostMapping("/users")
	public void save(User user) {
		UserB userB = mapper.map(user, UserB.class);
		exampleService.save(userB);
	}

	@GetMapping("/users/f")
	public String find() {

		return "Fernandoz";
	}

}
