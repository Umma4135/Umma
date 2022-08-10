package com.javaOops;

public class Encapsulation1 {
	
	private int a = 20;
	
	public int getA() {
		return a;
		
	}

	public void setA(int a) {
		this.a = a;
		
	}
	public static void main(String[] args) {
		Encapsulation1 en = new Encapsulation1();
		en.getA();
System.out.println(en.getA());
	}

}
