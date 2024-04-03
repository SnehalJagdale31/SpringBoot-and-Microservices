package com.sj.app.service;

import java.util.Collection;
import java.util.List;

import com.sj.app.binding.Passenger;
import com.sj.app.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger p);
	public Collection<Ticket> getAllTickets();
	
}
