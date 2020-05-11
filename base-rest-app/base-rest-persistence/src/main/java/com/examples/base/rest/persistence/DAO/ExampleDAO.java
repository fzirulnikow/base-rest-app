package com.examples.base.rest.persistence.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.base.rest.persistence.model.User;

public interface ExampleDAO extends JpaRepository<User, Integer> {

}
