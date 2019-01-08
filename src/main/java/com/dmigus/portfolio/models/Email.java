package com.dmigus.portfolio.models;

public class Email {
	 
public String subject;
public String message;
public String sender;
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
@Override
public String toString() {
	return "Email [subject=" + subject + ", message=" + message + ", sender=" + sender + "]";
}
}
