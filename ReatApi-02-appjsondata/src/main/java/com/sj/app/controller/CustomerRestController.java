package com.sj.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sj.app.binding.Customer;

import jakarta.websocket.server.PathParam;

@RestController
public class CustomerRestController {

	@GetMapping("/coustomer")
	public Customer getCustomer() {
		
		Customer c = new Customer(1,"sne","snenichit@gmail.com");
		return c;
	}
	
	@GetMapping("/coustomers")
	public List<Customer> getCustomers() {
		
		Customer c = new Customer(1,"sne","snenichit@gmail.com");
		Customer c1 = new Customer(2 , "ssp" , "ssp@gmail.com@gmail.com");
		Customer c2 = new Customer(3, "rd" , "rd@gmail.com@gmail.com");
		Customer c3 = new Customer(4, "ps" , "ps@gmail.com@gmail.com");
		List<Customer> customers = Arrays.asList(c,c1,c2,c3);	
		
		return customers;
	}
	
	
	@PostMapping("/customer")
	public String addCustomer(@RequestBody Customer c) {
		System.out.println(c);
		
		return "Customer Added";
		
	}
	

	@PutMapping("/customer")
	public String updateCustomer(@RequestBody Customer c) {
		System.out.println(c);
		
		return "Customer Added";
		
	}
	

	@DeleteMapping("/customer/{cid}")
	public String deleteCustomer(@PathVariable Integer cid) {
		
		
		return "Customer Added";
		
	}
	
}
