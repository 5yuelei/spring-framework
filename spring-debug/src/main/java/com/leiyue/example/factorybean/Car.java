package com.leiyue.example.factorybean;

public class Car {
	private String name;
	private String brand;
	private String speed;

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", brand='" + brand + '\'' +
				", speed='" + speed + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
}
