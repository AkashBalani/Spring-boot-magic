package com.pluralsight.conferencedemo;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConferenceDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConferenceDemoApplication.class, args);
	}

}
