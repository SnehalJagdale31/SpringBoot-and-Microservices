package com.sj.app.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.sj.app.binding.Passenger;
import com.sj.app.binding.Ticket;


@Service
public class TicketServiceImpl implements TicketService {

	Map<Integer,Ticket> db = new HashMap<>();
	
	
	
	@Override
	public Ticket bookTicket(Passenger p) {

		Ticket t = new Ticket();
		
		Random r = new Random(100);
		int id = r.nextInt(100);
		t.setTicketNum(id);
		
		BeanUtils.copyProperties(p, t);
		t.setStatus("CONFIRMED");
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		Ticket ticket = new Ticket(1,"PUNE-CN","raj@yopmail.com","PUNE", null, null, null, null);
		db.put(1, ticket);
		 Collection<Ticket> collection = db.values();
		 return collection;
		 
	}
	
	

}
