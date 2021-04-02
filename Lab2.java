package com.buzzfreeze.helloworld;

public class Lab2 {
	public static void main(String [] args) {
		bark();
	}
	public static void bark() {
		String dogName = "Sunny";
		System.out.println("The dog name = " + dogName + " bark");
		
		float a = 5.57f;
		int b = (int)a;
		System.out.println("mya : " + a);
		System.out.println("myb : " + b);
		
		
		int myInt = 5;
		float myFloat = myInt;
		System.out.println("myInt : " + myInt);
		System.out.println("myFloat : " + myFloat);
		
		double myDouble = 5.7;
		float newFloat = (float) myDouble;
		System.out.println("myDouble : " + myDouble);
		System.out.println("newFloat : " + newFloat);
		
		char c = 'a';
		int d = (int) c;
		System.out.println("myc : " + c);
		System.out.println("d : " + d);
		
		final String hello = "Hello";
	}
}
