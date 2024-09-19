package Interview_Projects;

public class VowelConsonant {

	public static void main(String[] args) {
		
		String word = "aartimahiveer";
		int vowelcount = 0;
		int consonantcount = 0;
		
		for(int i =0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ) {
				vowelcount++;
			}else if(ch>'a' && ch<'z') {
				consonantcount++;
				
			}
	
			
		}System.out.println("VowelCount is " + vowelcount );
		System.out.println("ConsonantCount is " + consonantcount);
	}   

}
