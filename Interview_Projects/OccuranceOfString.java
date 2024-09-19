package Interview_Projects;

public class OccuranceOfString {

	public static void main(String[] args) {
		String s = "Character";
		s = s.toLowerCase();
		char ch = 'c';
		
		int count = 0;
		
		for (int i=0; i<s.length(); i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}System.out.println("Occurance of c is " + count);
	
	}

}
