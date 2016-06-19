package com.comfine.javabean;

import java.sql.Date;

public class Company {
	private int company_id;
	private int serve_id;
	private String companyname;
	private String information;
	private String tel;
	private Date date;
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getServe_id() {
		return serve_id;
	}
	public void setServe_id(int serve_id) {
		this.serve_id = serve_id;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
