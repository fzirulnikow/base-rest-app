package com.examples.base.rest.api.mapper;

import org.springframework.stereotype.Component;

import com.examples.base.rest.api.model.User;
import com.examples.base.rest.business.model.UserB;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component("mapper_api")
public class Mapper extends ConfigurableMapper {

	@Override
	protected void configure(MapperFactory factory) {

//		factory.classMap(User.class, UserB.class).fieldMap("id").exclude().add().mapNulls(false).byDefault().register();
		factory.classMap(User.class, UserB.class);
	}

}
