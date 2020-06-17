package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw2 {
	public static void main(String[] args) {
		float L = readUserFloatInput("Enter Loan Amount: ");
		float I = readUserFloatInput("Enter Interest Rate: ");
		float N = readUserFloatInput("Enter Loan Period in Months: ");
		
		float a = L * I;
		float b = ((1 + I) * N) * N;
		
		
		
		
	}
	
	
	public static float readUserFloatInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

}
