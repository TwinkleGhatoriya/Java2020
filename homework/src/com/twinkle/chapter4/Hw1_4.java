package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw1_4 {
	public static void main(String[] args) {
		long num1 = readUserIntInput("Enter num 1: ");
		long num2 = readUserIntInput("Enter num 2: ");
		long num3 = readUserIntInput("Enter num 3: ");
		long num4 = readUserIntInput("Enter num 4: ");

		if (num1 < num2 && num1 < num3 && num1 < num4) {
			System.out.println("Lowest number is " + num1);
		} else if (num2 < num1 && num2 < num3 && num2 < num4) {
			System.out.println("Lowest number is " + num2);
		} else if (num3 < num1 && num3 < num2 && num2 < num4) {
			System.out.println("Lowest number is " + num3);
		} else if (num4 < num1 && num4 < num2 && num4 < num3) {
			System.out.println("Lowest number is " + num4);
		}

	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}
