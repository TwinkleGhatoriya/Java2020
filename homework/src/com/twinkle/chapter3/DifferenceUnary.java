package com.twinkle.chapter3;

import java.util.Scanner;

public class DifferenceUnary {
	public static void main(String[] args) {

		int num1 = (int) readUserIntInput("Enter num1: ");
		long num2 = readUserIntInput("Enter num2: ");
		long dif = num1 + num2;
		System.out.println("Diffrence: " + dif);

	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}

