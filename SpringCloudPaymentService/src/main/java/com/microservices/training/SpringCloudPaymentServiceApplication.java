package com.microservices.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudPaymentServiceApplication.class, args);
	}

}
