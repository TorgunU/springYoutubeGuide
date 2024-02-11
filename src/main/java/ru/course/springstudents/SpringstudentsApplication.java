package ru.course.springstudents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.course.springstudents.repository")
public class SpringstudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstudentsApplication.class, args);
	}

}
