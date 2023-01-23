package com.greatlearning.TicketTrackerApp.service;

import java.util.List;

import com.greatlearning.TicketTrackerApp.model.Ticket;

public interface TicketService {
	List<Ticket> getAllTickets(String keyword);

	Ticket getTicketById(int id);

	Ticket findTicketById(int id);

	Ticket addTicket(Ticket ticket);

	Ticket updateTicket(Ticket ticket);

	void deleteTicketById(int id);
}
