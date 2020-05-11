package com.examples.base.rest.business.mapper;

import org.springframework.stereotype.Component;

import com.examples.base.rest.business.model.UserB;
import com.examples.base.rest.persistence.model.User;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class Mapper extends ConfigurableMapper {

	@Override
	protected void configure(MapperFactory factory) {

		factory.classMap(User.class, UserB.class).fieldMap("id").exclude().add().mapNulls(false).byDefault().register();
	}

}
