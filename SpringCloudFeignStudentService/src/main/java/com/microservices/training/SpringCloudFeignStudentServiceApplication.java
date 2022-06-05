package com.microservices.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import jdk.jfr.Enabled;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudFeignStudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignStudentServiceApplication.class, args);
	}

}
