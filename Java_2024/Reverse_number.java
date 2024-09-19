package Java_2024;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		
		int rev;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		while(num>0) {
			 
			   rev = num % 10;
			   num = num / 10;
			   System.out.print(rev);
		}
		
		}
		
	
	}


