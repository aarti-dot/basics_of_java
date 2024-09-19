package Java_2024;

public class Remove_spaces {

	public static void main(String[] args) {
		
		String s1 = "My Name Is Aarti";
		String s2 = " ";
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i)!=' ') {
				
				s2 = s2+s1.charAt(i);
				
			}
		}   System.out.println(s2);
		


	}

}
