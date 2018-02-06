package com.rashika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author rashika.devadiga
 *
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = { PackageInfo.class, com.rashika.dto.mappers.PackageInfo.class,
		com.rashika.controller.PackageInfo.class, com.rashika.config.PackageInfo.class})
/*
 * @ComponentScan(basePackageClasses = { PackageInfo.class,
 * com.rashika.controller.PackageInfo.class,
 * com.rashika.services.PackageInfo.class,
 * com.rashika.dto.mappers.PackageInfo.class })
 */
@EntityScan(basePackageClasses = { com.rashika.entity.PackageInfo.class })
@EnableJpaRepositories(basePackageClasses = { com.rashika.repository.PackageInfo.class })
@PropertySource("classpath:application.properties")
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class AuditApplicationRunner {
	public static void main(String[] args) {
		SpringApplication.run(AuditApplicationRunner.class, args);
	}
}
