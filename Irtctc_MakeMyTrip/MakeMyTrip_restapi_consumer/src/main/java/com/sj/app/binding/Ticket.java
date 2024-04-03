package com.sj.app.binding;

import java.sql.Date;

public class Ticket {

	private Integer ticketNum;
	private String name;
	private String email;
	private String from;
	private String to;
	private Date doj;
	private Integer trainNum;
	private String status;
	
	
	public Integer getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(Integer ticketNum) {
		this.ticketNum = ticketNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNum=" + ticketNum + ", name=" + name + ", email=" + email + ", from=" + from + ", to="
				+ to + ", doj=" + doj + ", trainNum=" + trainNum + ", status=" + status + "]";
	}
	
}
