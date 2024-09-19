package Java_2024;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		
		int rem;
		int arm =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int c = num;
		
		while(num>0) {
			
			rem = num % 10;
			arm = (rem*rem*rem)+arm;
			num = num / 10;
				
		}if(c==arm) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}

	}

}
