package com.twinkle.chapter4;

import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args) {
		long Maths = readUserIntInput("Enter marks for Maths: ");
		long English = readUserIntInput("Enter marks for English: ");
		long Latin = readUserIntInput("Enter marks for Latin: ");
		long Science = readUserIntInput("Enter marks for Science: ");
		System.out.println("Subject     | Marks   | Grade  |");

		String Mathsgrade = gradeThis(Maths);
		String Englishgrade = gradeThis(English);
		String Latingrade = gradeThis(Latin);
		String Sciencegrade = gradeThis(Science);
		long Overall = (Maths + English + Latin + Science);
		long Overallp = (Maths + English + Latin + Science) / 4;
		String Overallper = gradeThis((Maths + English + Latin + Science) / 4);

		System.out.println("Maths       | " + Maths +   "      | " + Mathsgrade +   "      | ");
		System.out.println("English     | " + English + "      | " + Englishgrade + "      | ");
		System.out.println("Science     | " + Science + "      | " + Latingrade +   "      | ");
		System.out.println("Latin       | " + Latin +   "      | " + Sciencegrade + "      | ");
		System.out.println("Overall     | " + Overall + "/400" + " | "     +       "       | ");
		System.out.println("Overall %   | " + Overallp +"      | " + Overallper +   "      | ");
	}

	public static long readUserIntInput(String aInputMsg) {
		System.out.print(aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();

	}

	public static String gradeThis(long Grade) {

		String grade1 = null;
		
		if (Grade >= 91 && Grade <= 100) {
			grade1 = "A+";
		} else if (Grade >= 81 && Grade <= 90) {
			grade1 = "A";
		} else if (Grade >= 71 && Grade <= 80) {
			grade1 = "B+";
		} else if (Grade >= 61 && Grade <= 70) {
			grade1 = "B";
		} else if (Grade >= 51 && Grade <= 60) {
			grade1 = "C";
		} else if (Grade <= 50) {
			grade1 = "F";
		}
		return grade1;
	}

}
