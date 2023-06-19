package class4;

import java.util.Scanner;

public class MyProgram5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int LIMIT = 15;
		int count;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please give me a number between 1 and 12 : ");
		count = kb.nextInt();
		
		while(count < 1 || count > 12) {
			System.out.println("sorry invalid input");
			System.out.println("Please give me another num");
			count = kb.nextInt();
		}
		int i = 0;
		while(count <= LIMIT) {
			System.out.println(LIMIT - i);
			i++;
			count++;
		}
		
		System.out.println("Done");
	}

}
