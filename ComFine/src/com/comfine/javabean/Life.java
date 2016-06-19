package com.comfine.javabean;

import java.sql.Date;

public class Life {
	
	private int life_id;
	private int serve_id;
	private String company;
	private String type;
	private String tel;
	private Date up_date;
	private String facepath;
	public int getLife_id() {
		return life_id;
	}
	public void setLife_id(int life_id) {
		this.life_id = life_id;
	}
	public int getServe_id() {
		return serve_id;
	}
	public void setServe_id(int serve_id) {
		this.serve_id = serve_id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getUp_date() {
		return up_date;
	}
	public void setUp_date(Date up_date) {
		this.up_date = up_date;
	}
	public String getFacepath() {
		return facepath;
	}
	public void setFacepath(String facepath) {
		this.facepath = facepath;
	}
	
}
