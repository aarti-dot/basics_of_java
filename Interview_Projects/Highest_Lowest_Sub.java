package Interview_Projects;

import java.util.Arrays;

public class Highest_Lowest_Sub {

	public static void main(String[] args) {
		
		int arr[] = {9,7,5,2};
		Arrays.sort(arr);
		int hp = HighestNum(arr);
		int lp = LowestNum(arr);
		
		System.out.println("highest num is :" + hp);
		System.out.println("Lowest num is :" + lp);
		
	}
	public static int HighestNum(int []arr) {
		int hp = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length;j++) {
			 hp = Math.max(hp,arr[i]-arr[j]);
			}
		}return hp;
	}
	public static int LowestNum(int []arr) {
		int lp = Integer.MAX_VALUE;
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				lp = Math.min(lp, arr[i]-arr[j]);
			}
		}return lp;
	}

}
