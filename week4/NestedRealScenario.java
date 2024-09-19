package week4;

import java.util.Scanner;

public class NestedRealScenario {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name..");
		String Bname=sc.nextLine();
		if (Bname.equalsIgnoreCase("Chrome"))
			
		{
			System.out.println("Test case is running on Chrome");
			
		}else if(Bname.equalsIgnoreCase("Firefox"))
		{
			System.out.println("Test case is running on Firefox");
			
		}else if(Bname.equalsIgnoreCase("Edge"))
		{
			System.out.println("Test case is running on Edge");
			
		}else
		{
			System.out.println("Provide appropriot browser");
			
		}sc.close();
		

	}

}
