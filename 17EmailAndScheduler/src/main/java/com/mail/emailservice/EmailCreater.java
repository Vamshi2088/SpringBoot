package com.mail.emailservice;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailCreater {

	@Autowired
	private JavaMailSender ms;

	public void generateEmail(String toEmail, String subject, String body, String attachment) {

		MimeMessage mm=ms.createMimeMessage();
		try { 
			MimeMessageHelper mmh=new MimeMessageHelper(mm,true);
			mmh.setFrom("edlavamshi9963101@gmail.com");
			mmh.setTo(toEmail);
			mmh.setText(body);
			mmh.setSubject(subject);
			FileSystemResource fsr=new FileSystemResource(new File(attachment));
			mmh.addAttachment(fsr.getFilename(), fsr);
			ms.send(mm);
			System.out.println("sucessfully sent");
		} catch (MessagingException e) {
			e.printStackTrace();
			System.out.println("not sent");
		}
	}

}
