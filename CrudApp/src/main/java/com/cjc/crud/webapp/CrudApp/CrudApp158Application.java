package com.cjc.crud.webapp.CrudApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class CrudApp158Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudApp158Application.class, args);
	}

}
