package Interview_Projects;

public class Higest_lowest_array {

	public static void main(String[] args) {
		
		int array[] = {2,4,6,8,9};
		int hp = HighestElement(array);
		int lp = LowestElement(array);
		
		System.out.println("Highest Element is : "+ hp);
		System.out.println("Lowest Element is : "+ lp);

	}
	public static int HighestElement(int array[]) {
		int hp = Integer.MIN_VALUE;
		for(int i =0; i<array.length; i++) {
			for(int j= i+1; j<array.length; j++) {
				hp = Math.max(hp,array[i]*array[j]);
			}
		}return hp;
	}
	public static int LowestElement(int array[]) {
		int lp = Integer.MAX_VALUE;
		for(int i =0; i<array.length; i++) {
			for(int j= i+1; j<array.length; j++) {
				lp = Math.min(lp,array[i]*array[j] );
			}
		}return lp;
	}

}
