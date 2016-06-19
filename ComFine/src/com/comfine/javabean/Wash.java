package com.comfine.javabean;

import java.sql.Date;

public class Wash {
	private int wash_id;
	private int serve_id;
	private float price;
	private String type;
	private String tel;
	private String addr;
	private String facepath;
	private Date date;
	public int getWash_id() {
		return wash_id;
	}
	public void setWash_id(int wash_id) {
		this.wash_id = wash_id;
	}
	public int getServe_id() {
		return serve_id;
	}
	public void setServe_id(int serve_id) {
		this.serve_id = serve_id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getFacepath() {
		return facepath;
	}
	public void setFacepath(String facepath) {
		this.facepath = facepath;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
