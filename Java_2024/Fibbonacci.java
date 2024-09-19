package Java_2024;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term");
		int term = sc.nextInt();
		
		for(int i=0; i<=term; i++) {
			
			c = a+b;
			a = b;
			b = c;
			System.out.print(a + ",");
			
		}
		
		



	}

}
