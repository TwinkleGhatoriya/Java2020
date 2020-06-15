package com.twinkle.javatraining.chapter3;

import java.util.Scanner;

public class AdditionUnary {
	public static void main(String[] args) {

		int num1 = (int) readUserIntInput("Enter num1: ");
		long num2 = readUserIntInput("Enter num2: ");
		long sum = num1 + num2;
		System.out.println("Sum: " + sum);

	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}
