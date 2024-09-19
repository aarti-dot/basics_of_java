package Interview_Projects;

import java.util.Arrays;

public class Duplicate_array {

	public static void main(String[] args) {
		int []array = {1,3,4,4,5,6,6,7};
		
		Arrays.sort(array);
		
		for(int i =0; i<array.length-1; i++) {
			if(array[i]==array[i+1]) {
				System.out.println("Duplicate array is :"+ array[i]);
			}
		}
	
		
		
	}
}


