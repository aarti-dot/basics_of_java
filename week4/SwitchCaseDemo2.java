package week4;

import java.util.Scanner;

public class SwitchCaseDemo2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		switch (bname)
		{
		case"Chrome":
			System.out.println("Test case running on Chrome");
			break;	
	
			case"Firefox":
				System.out.println("Test case running on Firefox");
				break;
				
			case"Edge":
				System.out.println("Test case running on Edge");
				break;
				default:
					System.out.println("Provide appropriat data");
					sc.close();
					
				
	}		
		
		
	}

}
