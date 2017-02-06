package com.jikexueyuan.vehicle;

public class Bus extends Vehicle {
	private int price = 300000;

	public Bus(String type) {
		super(type);
	}

	@Override
	public String product() {
		return "新造了一辆" + getType() + "价格是:" + price;
	}
}