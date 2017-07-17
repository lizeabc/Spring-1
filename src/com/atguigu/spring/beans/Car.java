package com.atguigu.spring.beans;

public class Car {

	private String brand;
	private String  corp;
	private int price;
	private int maxSpeed;
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", corp=" + corp + ", price=" + price + ", maxSpeed=" + maxSpeed + "]";
	}
	public Car(String brand, String corp, int price) {
		super();
		this.brand = brand;
		this.corp = corp;
		this.price = price;
	};
}
