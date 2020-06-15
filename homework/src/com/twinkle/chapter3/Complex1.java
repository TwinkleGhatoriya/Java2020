package com.twinkle.chapter3;

import java.util.Scanner;

public class Complex1 {
	public static void main(String[] args) {
		
		int num1 = readUserIntInput("Enter num1: ");
		int num2 = readUserIntInput("Enter num2: ");
		int num3 = readUserIntInput("Enter num3: ");
		int result = num1 + num2 * num3;
		System.out.println("Result: " + result);

	}

	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}
