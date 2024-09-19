package Java_shammiclasses;

public class Arithmatic_Operators {
	
	int n=10;
	int m=5;
	
	
	public void addition() {
		int a=(n+m);
		System.out.println(a);	
	}
	public void sub() {
		int b=(n-m);
		System.out.println(b);
				
	}
	public void mul() {
		int c=(n*m);
		System.out.println(c);
					
	}
	public void div() {
		int d=(n/m);
		System.out.println(d);
	}

	public static void main(String[] args) {
		Arithmatic_Operators a1 = new Arithmatic_Operators();
		a1.addition();
		a1.sub();
		a1.div();
		a1.mul();

	}

}
