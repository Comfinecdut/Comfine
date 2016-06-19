package com.comfine.javabean;

import java.sql.Date;

public class News {
private int news_id;
private String title;
private String content;
private String up;
private Date date;
private String url;
private String path;
public int getNews_id() {
	return news_id;
}
public void setNews_id(int news_id) {
	this.news_id = news_id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getUp() {
	return up;
}
public void setUp(String up) {
	this.up = up;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}

}
