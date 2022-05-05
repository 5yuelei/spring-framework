package com.leiyue.example.selfConverter;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.ConversionService;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("MyConvert.xml");
		ConversionService bean = classPathXmlApplicationContext.getBean(ConversionService.class);
		Student convert = bean.convert("2,leiyuw", Student.class);
		System.out.println(convert);
	}
}
