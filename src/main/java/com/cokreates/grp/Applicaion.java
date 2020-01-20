package com.cokreates.grp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EnableJpaAuditing
public class Applicaion {

	public static void main(String[] args) {
		SpringApplication.run(Applicaion.class, args);
	}

	/**
	 * @PostConstruct is executed after all context initialization
	 * this method actually sets the default timezone inside the app
	 * as defined
	 **/
	@PostConstruct
	public void init() {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+6:00"));
	}

}
