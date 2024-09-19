package Scanner;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println(name);
		
		System.out.println("Enter you id");
		int id = sc.nextInt();
		System.out.println(id);
		
		System.out.println("Enter your number");
		int num = (int) sc.nextLong();
		System.out.println(num);
		
		sc.close();
		
		

	}

}
