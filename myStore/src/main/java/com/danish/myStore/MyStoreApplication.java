package com.danish.myStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.danish")
@EntityScan(basePackages = {"com.danish.model"})
@EnableJpaRepositories(basePackages = {"com.danish.dao"})
public class MyStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyStoreApplication.class, args);
	}
}
