package com.twinkle.javatraining.chapter3;

import java.util.Scanner;

public class Decrement {
	public static void main(String[] args) {
		
		long num = readUserIntInput("Enter num: ");
		long dif = --num ;
		System.out.println("Diffrence: " + dif);

	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}

