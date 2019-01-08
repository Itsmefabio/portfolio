package com.dmigus.portfolio.services;

public interface EmailSender {
	void sendEmail(String to, String subject, String content, String sender);
}
