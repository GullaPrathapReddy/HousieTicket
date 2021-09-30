package com.pt.demo;

import java.util.ArrayList;
import java.util.List;

public class TicketRows {

	private List<Object> cloumns=new ArrayList<Object>();;

	public TicketRows() {
		
	}
	
	public List<Object> getcloumns() {
		return this.cloumns;
	}
	
	public void addNumber(int number) {
		this.cloumns.add(number);
	}

}
