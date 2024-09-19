package Loops;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		int rem;
		
		while(num>0) {
			
			rem = num%10;
			num = num/10;
			sum = sum*10+rem;
			
		}
         System.out.println("Reverse number is " + sum);
         
         
         System.out.println("***************************");
         
         int num1 = 456;
         int sum1 = 0;
         int rem1;
         
         while(num1>0) {
        	 
        	 rem1 = num1%10;
        	 num1 = num1/10;
        	 sum1 = sum1*10+rem1;
        	 	 
         }
         System.out.println("Reverse number is " + sum1);
	}
	
	
        
}

