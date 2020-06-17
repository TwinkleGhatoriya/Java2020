package com.twinkle.chapter4;

public class Hw5_2 {
	public static void main(String[] args) {

		String monthNumber = getMonthNumber("Jan");
		System.out.println("Month: " + monthNumber);
	}

	public static String getMonthNumber(String aMonthName) {
		String monthNumber = "";

		switch (aMonthName) {
		case "Jan":
			monthNumber = "1";
			break;
		case "Feb":
			monthNumber = "2";
			break;
		case "Mar":
			monthNumber = "3";
			break;
		case "Apr":
			monthNumber = "4";
			break;
		case "May":
			monthNumber = "5";
			break;
		case "Jun":
			monthNumber = "6";
			break;
		case "Jul":
			monthNumber = "7";
			break;
		case "Aug":
			monthNumber = "8";
			break;
		case "Sep":
			monthNumber = "9";
			break;
		case "Oct":
			monthNumber = "10";
			break;
		case "Nov":
			monthNumber = "11";
			break;
		case "Dec":
			monthNumber = "12";
			break;
		default:
			System.out.println("Invalid month " + aMonthName);
			monthNumber = "unknown";

		}

		return monthNumber;
	}

}



