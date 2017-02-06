package com.jikexueyuan.vehicle;

/*
 * abstract 抽象类 按汽车车型和价格来分类
 */
public abstract class Vehicle {
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String type;

	// 构造器
	public Vehicle(String type) {
		this.type = type;
	}

	// 制造
	public void produce() {
		System.out.println(product());
	}

	// 抽象方法
	public abstract String product();
}
