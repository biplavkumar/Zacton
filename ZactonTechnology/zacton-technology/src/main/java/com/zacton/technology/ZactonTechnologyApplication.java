package com.zacton.technology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages=("com.**"))
@EnableJpaRepositories("com.**")
@EntityScan("com.zacton.reusable.**")
public class ZactonTechnologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZactonTechnologyApplication.class, args);
	}

}
