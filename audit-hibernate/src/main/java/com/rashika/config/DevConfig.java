package com.rashika.config;

import javax.sql.DataSource;

import org.h2.Driver;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DevConfig {

	@Bean
	@Profile("dev-h2")
	public DataSource dataSource() {
		return DataSourceBuilder.create().driverClassName(Driver.class.getName())
				.url("jdbc:h2:mem:audit;INIT=create schema if not exists audit;").build();
	}
}
