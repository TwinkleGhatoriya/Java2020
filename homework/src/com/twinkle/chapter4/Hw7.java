package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw7 {
	public static void main(String[] args) {

		System.out.println("key       " + "Description");
		System.out.println("-------------------------------------------");
		System.out.println("FC        " + "Fahrenheit -> Celsius");
		System.out.println("CF        " + "Celsius -> Fahrenheit");
		System.out.println("");
		String value = readUserStringInput("Select the conversion type: ");

		if (value.equalsIgnoreCase("FC")) {
			float conversion = readUserFloatInput("Enter value: ");
			float result = (conversion - 32) * 5 / 9;
			System.out.println("The temperature is " + result + " Celsius");
		} else if (value.equalsIgnoreCase("CF")) {
			float conversion = readUserFloatInput("Enter value: ");
			float result = (conversion * (9 / 5) + 32);
			System.out.println("The temperature is " + result + " Fahrenhite");
		} else {
			System.out.println("Invalid value");
		}

	}

	public static String readUserStringInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();

	}

	public static float readUserFloatInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

}
