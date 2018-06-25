package calrendar;
import java.util.Scanner;


public class sum {

	public static void main(String[] args) {
		int i,j;
		System.out.println("두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println(i +" , "+j);
		//System.out.println("두수의 합은 " + (i+j) + " 입니다");
		System.out.printf("%d와 %d의 합은 %d 입니다",i, j, i+j);
		sc.close();
		
	}

}
