package Interview_Projects;

public class EvenODD {

	public static void main(String[] args) {
		
		int  [] num = {7, 8,9,2,4,6};
		
		 for (int i = 0; i < num.length; i++) {
	            if (num[i] % 2 ==0) {
	            	
	               num[i] -=1;
	            }else {
	            	
	            	num[i] -=2;
	            }
		 }
	            System.out.println("Modified array :");
	            	for(int arr:num )
	            {
	            		System.out.print(arr + " ");
	            	}
	            	
	            	
	            	 
	     	        }
	            	
	            
		 
	            
	}           


