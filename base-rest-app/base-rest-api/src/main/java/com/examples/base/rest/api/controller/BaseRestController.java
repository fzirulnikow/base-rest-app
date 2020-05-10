package com.examples.base.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.base.rest.business.service.ExampleService;

import lombok.Data;

@RestController
@Data
public class BaseRestController {

	@Autowired
	public ExampleService exampleService;

	@GetMapping("/")
	public String initialGet() {
		return exampleService.initialGet();

	}

}
