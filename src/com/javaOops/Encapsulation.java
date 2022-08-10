package com.javaOops;


public class Encapsulation {  // Encapsulation in java is the mechanism of bindind
	//the method and variable into a single unit.
	
	private int a = 20;     //It can be private also,no matter in this class
	String x = "Blah blah";

	public char[] getA;     // Restricting access to the data member
			                    //from other class. But if they want to access ,go through getter/setter method
	
public int getA() {   //Getter method
		return a; // return statement is hold the value
	}

public void setA(int a) {  //Setter method
	this.a = a;            // setting the value of a
}
	public void getName() {
		System.out.println("Iam the void method");
	}

	public int getNumber() {
		System.out.println("I am the return type method");
		return a;
	}
	
public String getSomething() {
	return x;
}
	public static void main(String[] args) {
		
		Encapsulation obj = new Encapsulation();
		obj.getName();
		//System.out.println(obj.getName());       // void method returns nothing,only code execute
		//System.out.println(obj.getSomething());  //print only return type method

	}

}
