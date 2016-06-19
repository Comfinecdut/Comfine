package com.comfine.javabean;

import java.sql.Date;

public class Veg {
	private int veg_id;
	private int serve_id;
	private String vegname;
	private String introduce;
	private String chandi;
	private String jidi;
	private String company;
	private String tel_jidi;
	private String tel_cpn;
	private Date date;
	public int getVeg_id() {
		return veg_id;
	}
	public void setVeg_id(int veg_id) {
		this.veg_id = veg_id;
	}
	public int getServe_id() {
		return serve_id;
	}
	public void setServe_id(int serve_id) {
		this.serve_id = serve_id;
	}
	public String getVegname() {
		return vegname;
	}
	public void setVegname(String vegname) {
		this.vegname = vegname;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getChandi() {
		return chandi;
	}
	public void setChandi(String chandi) {
		this.chandi = chandi;
	}
	public String getJidi() {
		return jidi;
	}
	public void setJidi(String jidi) {
		this.jidi = jidi;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTel_jidi() {
		return tel_jidi;
	}
	public void setTel_jidi(String tel_jidi) {
		this.tel_jidi = tel_jidi;
	}
	public String getTel_cpn() {
		return tel_cpn;
	}
	public void setTel_cpn(String tel_cpn) {
		this.tel_cpn = tel_cpn;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
