package Interview_Projects;

public class String_Numeric {

	public static void main(String[] args) {
		 String s = "Test123";
		 for(int i=0; i<s.length();i++) {
			char ch=s.charAt(i);
			 if(Character.isDigit(ch)) {
				 System.out.print(ch);
			 }
		 }

	}

}
