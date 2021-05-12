package org.simplilearn.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootAwsApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(SpringbootAwsApplication.class, args);
// 	}

	@Override
  	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        	return builder.sources(Application.class);
	}
}
