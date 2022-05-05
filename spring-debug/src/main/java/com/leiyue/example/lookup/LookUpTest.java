package com.leiyue.example.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LookUpTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("MyLookUp.xml");
		FruitPlate fruitPlate1 = (FruitPlate) classPathXmlApplicationContext.getBean("fruitPlate1");
		fruitPlate1.getFruit();
		FruitPlate fruitPlate2 = (FruitPlate) classPathXmlApplicationContext.getBean("fruitPlate2");
		fruitPlate2.getFruit();
	}
}
