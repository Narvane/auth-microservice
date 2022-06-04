package com.narvane.singleprojects.authmicroservicesgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthMicroservicesGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthMicroservicesGatewayApplication.class, args);
	}

}
