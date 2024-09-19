package Interview_Projects;

public class UpperCase_LowerCase {

	public static void main(String[] args) {
		
		String s = "WelcomeToSelenium";
		int Uc = 0;
		int Lc = 0;
		
		for(int i=0; i<s.length();i++) {
			
			char c = s.charAt(i);
			if (c>='A'&& c<='Z') {
				Uc++;
			}else if(c>='a'&& c<='z') {
				Lc++;
			}
				
					
			
		}System.out.println("UpperCase " + Uc);
		System.out.println("LowerCase " + Lc);

	}

}
