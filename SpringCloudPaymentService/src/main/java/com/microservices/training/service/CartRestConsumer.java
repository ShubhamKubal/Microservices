package com.microservices.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartRestConsumer {

//	auto wire discovery client
	@Autowired
	private DiscoveryClient client;
	
	public String getCartInfo() {
		
//		requested a list of service instances with service Id as "CART-SERVICE"
		List<ServiceInstance> serviceInstanceList = client.getInstances("CART-SERVICE");
//		fetch the instance from the first index as there is only one instance of this service in our application
		ServiceInstance serviceInstance = serviceInstanceList.get(0);
//		fetch the URL required to fetch the resources from the service instance
		String url = serviceInstance.getUri() + "/cart/getData";
//		create an object of Rest Template
		RestTemplate restTemplate = new RestTemplate();
//		make a HTTP call and get Response data
		String response = restTemplate.getForObject(url, String.class);
//		return response
		return response;
	}

}
