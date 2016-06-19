package com.comfine.javabean;

import java.sql.Date;

public class Book{
private int book_id;
private String bookname;
private String author;
private String publish;
private Date pubdate;
private String pepname;
private Date date;
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublish() {
	return publish;
}
public void setPublish(String publish) {
	this.publish = publish;
}
public Date getPubdate() {
	return pubdate;
}
public void setPubdate(Date pubdate) {
	this.pubdate = pubdate;
}
public String getPepname() {
	return pepname;
}
public void setPepname(String pepname) {
	this.pepname = pepname;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}

