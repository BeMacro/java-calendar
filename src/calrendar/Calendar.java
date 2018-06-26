package calrendar;

import java.util.Scanner;

public class Calendar {

	public static int[] maxdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static int maxofmonth(int month) {
		return maxdays[month - 1];
	}

	public void samplecalendar() {
		System.out.println("일   월   화  수  목   금   토");
		System.out.println("--------------------");
		System.out.println("1  2   3  4  5  6  7");
		System.out.println("8  9  10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		
		String PROMPT="Cal>";

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		// System.out.println("반복횟수를 입력하세요.");
		// int repeat = sc.nextInt();

		while (true) {
			System.out.println("\n달을 입력하세요.");
			System.out.println(PROMPT);
			int month = sc.nextInt();
		
			if (month <1) {
				break;
			}
			if (month >12) {
				continue;
			}
			System.out.printf("%d 달의 최대일수는 %d일 입니다.\n", month, cal.maxofmonth(month));

			// cal.samplecalendar();
		}
		System.out.println("\n---bye---");
		sc.close();

	}

}
