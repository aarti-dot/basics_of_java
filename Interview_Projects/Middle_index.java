package Interview_Projects;

public class Middle_index {

	public static void main(String[] args) {
		
		int array[] = {10,20,30,50,60};
		int middleIndex = array.length/2;
		
		if(array.length % 2==1) {
			int middleElement = array[middleIndex];
			System.out.println("Middle Element " + middleElement);
		}else {
			int middleElement1 = array[middleIndex - 1];
			int middleElement2 = array[middleIndex];
			
			System.out.println("Middle Elements " + middleElement1 + " " + middleElement2);
			
		}

	}

}
