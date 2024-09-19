package week4;

import java.util.Scanner;

public class runtimeparameter 
{

	public void add(int a,int b)
	{
		System.out.println("addition is... "+(a+b));
			
	}
	public void sub(int a, int b)
	{
		System.out.println("substrsction is...."+(a-b));
		
	}
	
	{
		
	}
	public static void main(String[] args) 
	{
		runtimeparameter r1=new runtimeparameter();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		r1.add(num1, num2);
		r1.sub(num1, num2);
		r1.toString();
		
		
		
	
		
		
		
				
		

	}

}
