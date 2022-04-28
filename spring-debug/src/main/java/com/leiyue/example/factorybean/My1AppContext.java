package com.leiyue.example.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class My1AppContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("MyApplicationContext.xml");
		Car car = (Car) classPathXmlApplicationContext.getBean("car");
		System.out.println(car);
	}
}
