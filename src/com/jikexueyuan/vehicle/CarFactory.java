package com.jikexueyuan.vehicle;

public class CarFactory {
	public Vehicle creatVehicle(String type) {
		switch (type) {
		case "卡车":
			return new Truck("卡车");

		case "小汽车":
			return new Sedan("小汽车");
		case "跑车":
			return new SportCar("跑车");
		case "巴士":
			return new Bus("巴士");
		default:
			break;
		}
		return null;
	}

}
