package Oops;

public class MethodOverriding2 {
	
	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		
		MethodOverriding1 m1= new MethodOverriding1();
		m1.eat(); // i am eating
		
		MethodOverriding2 m2= new MethodOverriding2();
		m2.eat(); // You are eating
		
		
		
		


	}

}
