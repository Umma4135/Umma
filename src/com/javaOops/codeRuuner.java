package com.javaOops;


public class codeRuuner {

		
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getA);
		obj.setA(45);
		
		System.out.println(obj.getA());
		System.out.println(obj.getA());
		obj.setA(30);
		
		System.out.println(obj.getA());
		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getA());
		obj.setA(60);
		
		System.out.println(obj1.getA());

	}

}
