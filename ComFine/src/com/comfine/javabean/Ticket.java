package com.comfine.javabean;

import java.sql.Date;

public class Ticket {
	private int ticket_id;
	private int serve_id;
	private String type;
	private float price;
	private String company;
	private String tel;
	private Date effdate;
	private Date date;
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public int getServe_id() {
		return serve_id;
	}
	public void setServe_id(int serve_id) {
		this.serve_id = serve_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getEffdate() {
		return effdate;
	}
	public void setEffdate(Date effdate) {
		this.effdate = effdate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
