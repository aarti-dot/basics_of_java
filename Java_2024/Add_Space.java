package Java_2024;

public class Add_Space {

	public static void main(String[] args) {
		
		String s1 = "HelloWorld";
		String s2 = s1.replaceAll("([A-Z])", " $1").trim();
		System.out.println(s2);
		
		

	}

}
