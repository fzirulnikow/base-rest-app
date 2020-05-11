package com.examples.base.rest.business.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.base.rest.business.mapper.Mapper;
import com.examples.base.rest.business.model.UserB;
import com.examples.base.rest.persistence.DAO.ExampleDAO;
import com.examples.base.rest.persistence.model.User;

import lombok.Data;

@Component
@Data
public class ExampleService {

	@Autowired
	public ExampleDAO exampleDAO;

	@Autowired
	private Mapper mapper;

	public void save(UserB userB) {
		User user = mapper.map(userB, User.class);
		exampleDAO.save(user);
	}

	public List<UserB> findAll() {
		List<User> users = exampleDAO.findAll();
		List<UserB> usersB = new ArrayList<UserB>();
		for (User user : users) {
			usersB.add(mapper.map(user, UserB.class));

		}
		return usersB;
	}

}
