package com.newsFactory.somenews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SomenewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SomenewsApplication.class, args);
	}

}
