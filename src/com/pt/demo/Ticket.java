package com.pt.demo;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private List<TicketRows> rows =new ArrayList<>();
	
	public List<TicketRows> getTicketRows(){
		return this.rows;
	}
	
	
	public void add(TicketRows row) {
		this.rows.add(row);
	}
}
