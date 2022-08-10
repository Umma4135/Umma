package com.Interface;

public class Interface implements Interface1,Interface2,Interface3 {
	             // This page overload & override

	@Override
	public void uk() {
		System.out.println("shoshi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ss() {
		System.out.println("Shama");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sm() {
		System.out.println("Samara");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTuktuk() {
		System.out.println("Love");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLalala() {
		System.out.println("Pencils");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Regular() {
		System.out.println("pens");
	}
	
		
	
		// TODO Auto-generated method stub
		
	
public static void main(String[]args) {
	Interface in = new Interface();
	in.getLalala();
	in.getTuktuk();
	in.Regular();
	in.sm();
	in.ss();
	in.uk();
	
	
	
}
}
	




