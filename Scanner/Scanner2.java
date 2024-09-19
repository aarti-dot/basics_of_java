package Scanner;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		System.out.println("Addition of two number is :" +(s1+s2));
		sc.close();
	

	}

}
