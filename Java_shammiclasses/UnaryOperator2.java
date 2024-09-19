package Java_shammiclasses;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		System.out.println(++a + ++b); //6,6,11,11// 17
		System.out.println(++a + ++b); //7,7,12,12 // 19
		System.out.println(a++ + b++); //7, 7, 12, 12 // 19
		System.out.println(a+b); //21
	}

}
