package Java_2024;

import java.util.Scanner;

public class Palindrom_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem;
		int s = 0;
		int number = num;
		
		
		while(num>0) {
			
			rem = num % 10;
			s = (s*10)+rem;
			num = num / 10;
          	
		}if(number==s) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("number is not palindrom");
		}
		


	}

}
