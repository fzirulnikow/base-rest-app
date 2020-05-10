package com.examples.base.rest.persistence.DAO;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ExampleDAO {

	public String initialGet() {
		return "Hola!";
	}

}
