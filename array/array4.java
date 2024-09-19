package array;

public class array4 {

	public static void main(String[] args) {
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println("length of row " + a.length);
		System.out.println("length of column" + a[0].length);
		
		// read single value
		System.out.println("value of first row second column " + a[0] [1]); //200
		System.out.println("value of third row first column " + a[2] [0]); //500
		System.out.println("value of 2nd row second column " + a[1] [1]); //400

		// read all values
		for (int r=0; r<=2; r++) {
			for(int c=0; c<=1; c++) {
				System.out.println(a[r][c] + " " );
				
			}System.out.println();
		}
	}

}
