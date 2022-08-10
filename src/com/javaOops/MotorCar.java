package com.javaOops;

public class MotorCar extends Train{
	public void wheel() {
		System.out.println("It has two wheels"); //Main method create on child class, 
	}                                     //all methods are come in same class.
	                                      //If i create main method in parent class it
	                                       //shows only grandparents method.

	public static void main(String[] args) {
		MotorCar mc = new MotorCar();
		mc.speed();
		mc.wheel();
		mc.getname();

	}

}
