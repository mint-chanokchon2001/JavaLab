package com.buzzfreeze.helloworld;

public class Lab4 {
	public static void main(String[] args) {
		int score = 0;
		boolean isHandSome = true;

		if (score >= 80 || isHandSome == true) {
			System.out.println("Good");
		} else if (score >= 50) {
			System.out.println("normal");
		} else {
			System.out.println("fail");
		}
	}
}
