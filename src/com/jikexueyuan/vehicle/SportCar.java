package com.jikexueyuan.vehicle;

public class SportCar extends Vehicle {
	private int price = 400000;

	public SportCar(String type) {
		super(type);
	}

	public String product() {
		return "新造了一辆" + getType() + "价格是:" + price;
	}
}
