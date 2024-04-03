package com.sj.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sj.app.binding.Passenger;
import com.sj.app.binding.Ticket;
import com.sj.app.service.MakeMyTripService;

@RestController
public class MakeMyTripController {

	@Autowired
	private MakeMyTripService service;
//	
//	@GetMapping("/")
//	public String index(Model model) {
//		
//		List<Ticket> allTickets = service.getAllTickets();
//		model.addAttribute("tickets",allTickets);
//		return "index";
//		
//	}
//	
	

	@GetMapping("/tickets")
	public List<Ticket> getAllTickets() {
		
		return service.getAllTickets();
		
		
	}
	

	@PostMapping("/tickets")
	public Ticket createTickerts(@RequestBody Passenger  passenger) {
		
		return service.bookTicket(passenger);
		
		
	}
	
	
	
}
