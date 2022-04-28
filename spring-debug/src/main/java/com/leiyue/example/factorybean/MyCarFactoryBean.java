package com.leiyue.example.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class MyCarFactoryBean implements FactoryBean<Car> {

	private String carInfo;

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		String[] split = carInfo.split(",");
		car.setName(split[0]);
		car.setBrand(split[1]);
		car.setSpeed(split[2]);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}
