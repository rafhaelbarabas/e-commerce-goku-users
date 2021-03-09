package com.ecommercegoku.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ECommerceGokuUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceGokuUsersApplication.class, args);
	}

}
