package com.twinkle.javatraining.chapter3;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		//Enter two numbers
		int num1 = readUserIntInput("Enter num1: ");
		int num2 = readUserIntInput("Enter num2: ");
		//Add two numbers
		int sum = num1 + num2;
		//Print the result
		System.out.println("Sum: " + sum);

	}

	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}
