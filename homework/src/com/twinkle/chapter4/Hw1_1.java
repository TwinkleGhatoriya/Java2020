package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw1_1 {
	public static void main(String[] args) {
		long number = readUserIntInput("Enter num: ");
		if (number % 2 == 0) {
			System.out.println("Number " + number + " is even");
		} else {
			System.out.println("Number " + number + " is odd");
		}
	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

}

