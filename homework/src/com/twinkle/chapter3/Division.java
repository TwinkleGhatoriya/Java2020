package com.twinkle.chapter3;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		
		int num1 = readUserIntInput("Enter num1: ");
		int num2 = readUserIntInput("Enter num2: ");
		int div = num1 / num2;
		System.out.println("Division: " + div);

	}

	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}
