package Java_2024;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Number is not prime");
		}
	}   
	       public static boolean isPrime(int num) {
	    	   for(int i=2; i<=num/2; i++) {
	    		   if(num % i==0) {
	    			   return false; 
	    		   }
	    		   
	    	   }return true;
	       }
}
