package Scanner;

import java.util.Scanner;

public class Scanner3 {
	
	public void add(int a, int b) {
		System.out.println("Addition of two number is :" +(a+b));
	}

	public static void main(String[] args) {
		//Run time addition
		Scanner3 s3 = new Scanner3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		s3.add(num1, num2);
		sc.close();
		
		

	}

}
