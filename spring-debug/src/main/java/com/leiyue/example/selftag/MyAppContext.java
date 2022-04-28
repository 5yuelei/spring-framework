package com.leiyue.example.selftag;

import com.leiyue.example.factorybean.Car;
import com.leiyue.example.selftag.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppContext {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("MyApplicationContext.xml");
//		Car car = (Car) classPathXmlApplicationContext.getBean("car");
//		System.out.println(car);

		Student lalala = (Student) classPathXmlApplicationContext.getBean("lalala");
		System.out.println(lalala.getName());
	}
}
