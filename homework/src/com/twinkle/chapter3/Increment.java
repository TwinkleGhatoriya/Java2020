package com.twinkle.chapter3;

import java.util.Scanner;

public class Increment {
	public static void main(String[] args) {
		
		long num = readUserIntInput("Enter num: ");
		long sum = ++num ;
		System.out.println("Sum: " + sum);

	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}

