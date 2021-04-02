package com.buzzfreeze.helloworld;

public class Lab5 {
	public static void main(String[] args) {
		int score2 = 70;
		switch (score2) {
		case 80:
			System.out.print("Grad A");
			break;
		case 70:
			System.out.print("Grad B");
			break;
		case 60:
			System.out.print("Grad C");
			break;
		case 50:
			System.out.print("Grad D");
			break;
		case 40:
			System.out.print("Grad F");
			break;
		default:
			System.out.println("Grad E");
		}
	}
}
