package com.comfine.javabean;

import java.sql.Date;

public class Teacher {
private int teacher_id;
private int serve_id;
private String teachername;
private String introduce;
private float price;
private Date datetime;
private String facepath;
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public int getServe_id() {
	return serve_id;
}
public void setServe_id(int serve_id) {
	this.serve_id = serve_id;
}
public String getTeachername() {
	return teachername;
}
public void setTeachername(String teachername) {
	this.teachername = teachername;
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
public Date getDatetime() {
	return datetime;
}
public void setDatetime(Date datetime) {
	this.datetime = datetime;
}
public String getFacepath() {
	return facepath;
}
public void setFacepath(String facepath) {
	this.facepath = facepath;
}

}
