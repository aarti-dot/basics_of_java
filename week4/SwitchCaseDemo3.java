package week4;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		String s1=sc.nextLine();
		char c1=s1.charAt(0);
		switch(c1) 
		{
		case 'a':
			System.out.println("It is a vowel");
			break;
		case 'e':
			System.out.println("It is a vowel");
			break;
		case 'i':
			System.out.println("It is a vowel");
			break;
		case 'o':
			System.out.println("It is a vowel");
			break;
		case 'u':
			System.out.println("It is a vowel");
			break;
			default:
			System.out.println("It is not a vowel");
			
			
			
		}
		
	}

}
