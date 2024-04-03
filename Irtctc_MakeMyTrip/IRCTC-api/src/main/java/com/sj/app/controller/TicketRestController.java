package com.sj.app.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.app.binding.Passenger;
import com.sj.app.binding.Ticket;
import com.sj.app.service.TicketService;

@RestController
public class TicketRestController {
	
	
	@Autowired
	private TicketService service;
	
	@PostMapping("/tickets")
	public ResponseEntity<Ticket> bookTicket(Passenger p){
		Ticket ticket = service.bookTicket(p);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getTickets(){
		Collection<Ticket> allTickets = service.getAllTickets();
		return new ResponseEntity<>(allTickets,HttpStatus.OK);
		
	}

}
