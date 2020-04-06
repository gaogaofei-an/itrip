package com.whackon.itrip;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class MailDemo {
	public static void main(String[] args) {
		// 用于发送邮件
		JavaMailSender mailSender = new JavaMailSenderImpl();
		// 创建邮件信息对象
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		// 收件人
		mailMessage.setTo("eryuerucao@163.com");
		// 发件人
		mailMessage.setFrom("dk0j190901q@163.com");
		// 邮件主题
		mailMessage.setSubject("这是一份测试邮件");
		// 邮件内容
		mailMessage.setText("这是来自张伟的亲切问候，张伟正式通知你，他已经深深的爱上了XXX");

		// 设置邮箱信息
		mailSender.send(mailMessage);
	}
}
