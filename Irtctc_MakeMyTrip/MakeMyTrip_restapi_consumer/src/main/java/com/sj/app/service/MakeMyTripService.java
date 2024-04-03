package com.sj.app.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sj.app.binding.Passenger;
import com.sj.app.binding.Ticket;

@Service
public class MakeMyTripService {
	
	public Ticket bookTicket(Passenger p) {
		
		System.out.println("Passenger: "+p);
		String apiurl = "http://localhost:8080/tickets";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> forEntity = rt.postForEntity(apiurl, p, Ticket.class);
		Ticket body = forEntity.getBody();
		
		return body;
		
	}
	
	public List<Ticket> getAllTickets(){
		System.out.println("inside getAllTickets..1");
		String apiurl = "http://localhost:8080/tickets";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket[]> forEntity=
				rt.getForEntity(apiurl, Ticket[].class);
		Ticket[] body = forEntity.getBody();
    
		List<Ticket> tickets =Arrays.asList(body);
		
		return tickets;
		
	}

}
