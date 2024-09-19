package Interview_Projects;

public class LargestNumber {

	public static void main(String[] args) {
		
		int array[] = {20,30,40,50,60};
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i<array.length; i++) {
			if(array[i]>max) {
			max = array[i];
			}else if (array[i]<min) {
				min = array[i];
				
			}
		}
				System.out.println("largest array is " + max);
				System.out.println("lowest array is " + min);
			}
		


	
	
}
