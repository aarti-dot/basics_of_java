package Interview_Projects;

public class SwapInt {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping: ");
        System.out.println("value of a is = " + a);
        System.out.println("value of b is = " + b);
		
		
		a = a+b; //30
		b = a-b; //10
		a = a-b; //10
		
		System.out.println("After swapping: ");
		System.out.println("value of a is " + a);
		System.out.println("value of b is " + b);
		

	}

}
