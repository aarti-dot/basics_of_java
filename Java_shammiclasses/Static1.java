package Java_shammiclasses;

public class Static1 {
	int a = 5;
	String s = "seema";
	static int b = 10;
	
	
	public void method() {
		int x = 15;
		System.out.println(x);
	}
	public static void p() {
		int y = 20;
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		System.out.println(b);
		
		Static1 s1 = new Static1();
		System.out.println(s1.a);
		System.out.println(s1.s);
		s1.method();
		p();
	
				
		

	}

}
