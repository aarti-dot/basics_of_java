package week4;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number between 0 to 5");
		int num=sc.nextInt();
		
		switch (num) {
		case 0:
			System.out.println("Zero");
			break;
			
		case 1:
			System.out.println("One");
			break;
			
		case 2:
			System.out.println("Two");
			break;
			
		
		case 3:
			System.out.println("Three");
			sc.close();
			
			
			
			
			
			
			
			
			
			break;
			
		default:
			System.out.println("Enter wrong number");
			
			break;
		}

	}

}
