package Interview_Projects;

public class ArraysEquality {

	public static void main(String[] args) {
		
	      int [] array1 = {1,2,3,4,5};
	      int [] array2 = {1,2,3,4,5};
	
	      boolean equals = Equal(array1,array2);
	      System.out.println( "The arrays are equal " + equals);
	}

	private static boolean Equal(int[] array1, int[] array2) {
		if(array1==null || array2==null ) {
		return false;
	} 
		
		if(array1.length!=array2.length) {
		return false;
    }
		
		for(int i=0; i<array1.length; i++) {
			if(array1[i] != array2[i]);
	    return false;
	}
		 	 
 
	return true;
   
}          
          
          
}