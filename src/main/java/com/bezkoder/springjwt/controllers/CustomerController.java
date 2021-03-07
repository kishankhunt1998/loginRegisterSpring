package com.bezkoder.springjwt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Customer;
import com.bezkoder.springjwt.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
    private CustomerRepository customerRepository;

	@PostMapping
	public Customer create (@RequestBody Customer customer){
	   return customerRepository.saveAndFlush(customer);
	}
	
		
}
