package com.examples.base.rest.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.examples.base.rest.persistence.DAO.ExampleDAO;

import lombok.Data;

@Component
@Data
public class ExampleService {

	@Autowired
	public ExampleDAO exampleDAO;

	public String initialGet() {
		return exampleDAO.initialGet();
	}

}
