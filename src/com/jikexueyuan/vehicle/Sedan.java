package com.jikexueyuan.vehicle;

public class Sedan extends Vehicle {
	private int price = 250000;

	public Sedan(String type) {
		super(type);
	}

	@Override
	public String product() {
		return "新造了一辆" + getType() + "价格是:" + price;
	}

}
