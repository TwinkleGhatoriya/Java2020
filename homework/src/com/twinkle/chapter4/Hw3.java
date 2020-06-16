package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		long Grade = readUserIntInput("Enter percentage of the student: ");

		if (Grade >= 91 && Grade <= 100) {
			System.out.println("Grade of the student is A+");
		} else if (Grade >= 81 && Grade <= 90) {
			System.out.println("Grade of the student is A");
		} else if (Grade >= 71 && Grade <= 80) {
			System.out.println("Grade of the student is B+");
		} else if (Grade >= 61 && Grade <= 70) {
			System.out.println("Grade of the student is B");
		} else if (Grade >= 51 && Grade <= 60) {
			System.out.println("Grade of the student is C");
		} else if (Grade <= 50) {
			System.out.println("Unfortunately the student has failed");
		}

	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

}
