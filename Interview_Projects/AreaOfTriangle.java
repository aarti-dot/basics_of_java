package Interview_Projects;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base");
		int base = sc.nextInt();
		System.out.println("Enter the height");
		int height = sc.nextInt();
		double area = 0.5*base*height;
		System.out.println("Area of triangle :" + area);



	}

}
