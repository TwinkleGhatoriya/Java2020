package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw6 {
	public static void main(String[] args) {
		System.out.println("CHEESE_PIZZA_COST: $10");
		System.out.println("VEGGIE_PIZZA_COST: $15");
		System.out.println("MEAT_LOVER_PIZZA_COST: $17");
		System.out.println("SATATE_TAX_PERCENTAGE: 6");

		int c = readUserIntInput("Number of cheese pizza: ");
		int v = readUserIntInput("Number of veggie pizza: ");
		int m = readUserIntInput("Number of meat pizza: ");

		int cp = c * 10;
		int vp = v * 15;
		int mp = m * 17;
		float sales = (float) ((cp + vp + mp) * 0.06);
		float total = cp + vp + mp + sales;

		System.out.println("Todis Pizza Store");
		System.out.println("-------------------------------------------");
		System.out.println("Item             " + "Quantity     " + "Cost        ");
		System.out.println("-------------------------------------------");
		if (c > 0) {
			System.out.println("Cheese pizza     " + c + "             " + cp);
		}
		if (v > 0) {
			System.out.println("Veggie pizza     " + v + "             " + vp);
		}
		if (m > 0) {
			System.out.println("Meat pizza       " + m + "             " + mp);
		}
		System.out.println("");
		System.out.println("Sales            " + "             " + sales);
		System.out.println("-------------------------------------------");
		System.out.println("Total Due        " + "             " + total);

	}

	public static int readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}
}