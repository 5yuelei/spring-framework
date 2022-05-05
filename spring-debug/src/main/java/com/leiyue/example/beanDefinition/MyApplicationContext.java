package com.leiyue.example.beanDefinition;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplicationContext extends ClassPathXmlApplicationContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("MyBeanDefninitionContext.xml");

	}
}
