package com.microservices.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.training.service.CartRestConsumer;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	
	@Autowired
	private CartRestConsumer cartConsumer;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/data")
	public String getPaymentDate() {
		return "FROM PAYMENT-SERVICE : " + cartConsumer.getCartInfo();
	}
	
	@GetMapping("/info")
    public ResponseEntity<String> showPaymentInfo() {
       return ResponseEntity.ok("FROM PAYMENT SERVICE, Port# is: " + port);
    }

}
