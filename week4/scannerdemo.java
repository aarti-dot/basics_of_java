package week4;

import java.util.Scanner;

public class scannerdemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name...");
		String name=sc.nextLine();
		
		System.out.println("Enter your last name");
		String Lastname=sc.nextLine();
		System.out.println("Enter your age...");
		int age=sc.nextInt();
		System.out.println("Enter your phone number...");
		int number = sc.nextInt();
		
		
		sc.close();

	}

}
