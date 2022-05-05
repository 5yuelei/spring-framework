package com.leiyue.example.replace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReplaceTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("MyReplace.xml");
		OriginalDog originalReplaceMethod = classPathXmlApplicationContext.getBean("originalReplaceMethod", OriginalDog.class);
		originalReplaceMethod.sayHello("结果被替换");
	}
}
