package com.twinkle.javatraining.chapter3;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		
		int num1 = readUserIntInput("Enter num1: ");
		int num2 = readUserIntInput("Enter num2: ");
		int mul = num1 * num2;
		System.out.println("Multiplication: " + mul);

	}

	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}
