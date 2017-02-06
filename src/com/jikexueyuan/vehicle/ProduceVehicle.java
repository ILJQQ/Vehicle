package com.jikexueyuan.vehicle;

public class ProduceVehicle {
	public static void main(String[] args) {
		// 新建工厂对象并调用输出方法
		CarFactory car = new CarFactory();
		car.creatVehicle("小汽车").produce();
		car.creatVehicle("卡车").produce();
		car.creatVehicle("跑车").produce();
		car.creatVehicle("巴士").produce();
	}
}
