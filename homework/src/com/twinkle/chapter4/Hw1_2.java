package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw1_2 {
	public static void main(String[] args) {
		long number = readUserIntInput("Enter num: ");
		if (number > 100) {
			System.out.println("Number " + number + " is greater then 100");
		}
	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

}
