package Java_2024;

import java.util.Scanner;

public class Sum_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		
		while(num>0) {
			
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			
		}System.out.print(sum);


	}

}
