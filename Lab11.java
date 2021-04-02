package com.buzzfreeze.helloworld;

public class Lab11 {
	public static void main(String[] args) {
		CalPlus(5,6);
		System.out.println(CalPlus2(5,9));
	}
	public static void CalPlus (int x, int y) {
		System.out.println(x+y);
	}
	public static int CalPlus2 (int x, int y) {
		return x+y;
	}
}
