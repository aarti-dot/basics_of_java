package Loops;

public class Pattern1 {

	public static void main(String[] args) {

     for(int i=1; i<=4; i++) {
    	 for(int j=1; j<=i; j++) {
    		 System.out.print("*" + " ");
    	 }
        System.out.println();
     }
     
     System.out.println("***********************");
	
	
       for(int i=1; i<=5; i++) {
    	   for(int j=1; j<=i; j++){
    		   System.out.print("1" + " ");
    	   }
    	   System.out.println();
       }
       
       System.out.println("**************************");
       
       
     for(int i =1; i<=5; i++) {
    	 
    	 for(int j =1; j<=i; j++) {
    		 
    		 System.out.print(j + " ");
    	 }
    	 System.out.println();
    	 
     }
     System.out.println("*******************************");
     int num = 1;
     for(int i =1; i<=5; i++) {
    	 for(int j=1; j<=i; j++) {
    		 System.out.print(num + " ");
    		 num++;
    	 }
    	 System.out.println();
     }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     
       
}
}