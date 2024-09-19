package array;

public class ArraySubstrsction {
	
	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 5, 6, 7};
	        
	        // Subtract one from even and odd numbers
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) { // even number
	                arr[i] -= 1;
	            } else { // odd number
	                arr[i] -= 2;
	            }
	        }
	        
	        // Print the modified array
	        System.out.println("Modified array:");
	        for (int num : arr) {
	           System.out.print(num + " ");
	        }
	    }
	}



