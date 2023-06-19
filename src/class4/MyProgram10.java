package class4;

import java.util.Scanner;

public class MyProgram10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int sum = 0;
		int num = 0;

		do {
			sum = sum + num;
			System.out.println("Please give me pos num ?");
			num = kb.nextInt();
		} while (num >= 0);

		System.out.println("the sum of pos num is " + sum);
	}

}
