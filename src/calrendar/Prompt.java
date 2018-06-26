package calrendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "Cal> ";

	public void runprompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("\n달을 입력하세요.");
			System.out.println(PROMPT);

			int month = sc.nextInt();

			if (month < 1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.mycalendar(2018, month);
			System.out.println();

			
		
		}
		System.out.println("\n---bye---");
		sc.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runprompt();

	}

}
