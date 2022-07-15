package method;

import java.util.Scanner;

public class RecursiveMethod {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		System.out.println("result2=" + factorial(num));
	}
	
	private static int factorial(int num) {
		System.out.print("factorial(" + num + ")");
	
	if (num<=1) return 1;
	
	return num * factorial(num - 1); //Stack 영역이다.
	}
}
