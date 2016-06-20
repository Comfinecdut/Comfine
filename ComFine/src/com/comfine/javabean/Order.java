package com.comfine.javabean;

import java.util.Date;

public class Order {
	private int order_id;
	private int sever_id;
	private int user_id;
	private int content_id;
	private String ordername;
	private String introduce;
	private float price;
	private String progress;
	private Date up_date;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getServe_id() {
		return sever_id;
	}
	public void setServe_id(int serve_id) {
		this.sever_id = serve_id;
	}
	public String getOrdername() {
		return ordername;
	}
	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProgress() {
		return progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}
	public int getSever_id() {
		return sever_id;
	}
	public void setSever_id(int sever_id) {
		this.sever_id = sever_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public Date getUp_date() {
		return up_date;
	}
	public void setUp_date(Date up_date) {
		this.up_date = up_date;
	}
	
}
