package calrendar;

import java.util.Scanner;

public class Calendar {

	public static int[] maxdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int maxofmonth(int month) {
		return maxdays[month - 1];
	}

	public void mycalendar(int year, int month) {
		System.out.printf("     %3d 년 %2d 월 \n ", year, month);
		System.out.println("SU MO TU WE TH FI SA");
		System.out.println("--------------------");
		int maxday = maxofmonth(month);
		for (int i = 1; i <= maxday; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == 0) {
				System.out.println();
			}

		}

		// System.out.println("1 2 3 4 5 6 7");
		// System.out.println("8 9 10 11 12 13 14");
		// System.out.println("15 16 17 18 19 20 21");
		// System.out.println("22 23 24 25 26 27 28");
		// System.out.println("29 30 31 ");
	}

	public static void main(String[] args) {

	}

}
