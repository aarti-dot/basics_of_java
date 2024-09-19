package Interview_Projects;

public class Separate_Character_Number_Symbols {

	public static void main(String[] args) {
		
		String ch = "ABC!&#*4578@M/b";
		StringBuilder Lt = new StringBuilder();
		StringBuilder nm = new StringBuilder();
		StringBuilder sm = new StringBuilder();
		
		for(char c : ch.toCharArray()) {
			if(c>='a' && c<='z' || c>='A' && c<='Z') {
				Lt.append(c);
			}else if(c>='0' && c<='9') {
				nm.append(c);
			}else {
				sm.append(c);
				
			}
		}System.out.println("Letters "+ Lt);
		System.out.println("Number "+ nm);
		System.out.println("Symbol "+ sm);
	}

}
