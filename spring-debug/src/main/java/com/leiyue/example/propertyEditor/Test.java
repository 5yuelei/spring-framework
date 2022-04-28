package com.leiyue.example.propertyEditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("propertyEditor.xml");
		Customer customer = (Customer) classPathXmlApplicationContext.getBean("customer");
		System.out.println(customer);
	}
}
