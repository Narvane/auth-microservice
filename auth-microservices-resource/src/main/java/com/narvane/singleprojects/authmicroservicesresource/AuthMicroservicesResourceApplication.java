package com.narvane.singleprojects.authmicroservicesresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthMicroservicesResourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthMicroservicesResourceApplication.class, args);
	}

}
