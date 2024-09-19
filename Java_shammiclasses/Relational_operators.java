package Java_shammiclasses;

public class Relational_operators {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		
		if(a !=b) {
			System.out.println("a is not equal to b");
		}else {
			System.out.println("a is equal to b");
		}String s="HELLO";
		 String r="hello";
		 if(s==r) {
			 System.out.println("s is equal to r");
		 }else {
			 System.out.println("s is not equal to r");
		 }
		 if(s.equals(r)) {
			 System.out.println("s is equal to r");
		 }else {
			 System.out.println("s is not equal to r");
		 }
		 if(s.equalsIgnoreCase(r)) {
			 System.out.println("s is equal to r");
		 }else {
			 System.out.println("s is not equal r");
		 }
	}

}
