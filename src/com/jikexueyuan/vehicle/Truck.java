package com.jikexueyuan.vehicle;

public class Truck extends Vehicle {
	private int price = 200000;

	public Truck(String type) {
		super(type);
	}

	@Override
	public String product() {
		return "新造了一辆" + getType() + "价格是:" + price;
	}
}
