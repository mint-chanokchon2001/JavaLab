package com.buzzfreeze.helloworld;

public class Lab6 {
	public static void main(String[] args) {
		int i = 1;
		int j = i;
		while (i <= 10) {
			System.out.print(i);
			j += i;
			i++;
		}
		System.out.println();
		System.out.println(j);

		System.out.println("Find % 12 == 0");
		for (int num = 1; num <= 100; num++) {
			if (num % 12 == 0) {
				System.out.println(num);
			} else {
				continue;
			}
		}

		int[] myArray = { 1, 2, 3, 4, 5 };
		for (int data : myArray) {
			System.out.println(data);
		}
	}
}
