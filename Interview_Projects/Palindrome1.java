package Interview_Projects;

public class Palindrome1 {

	public static void main(String[] args) {
		String S = "LEVEL";
		boolean isPalindrome = true;
		for(int i=0; i<S.length();i++) {
			for(int j=S.length()-1;j>i; j--  ) {
				if(S.charAt(i)!=S.charAt(j)) {
					
			
					isPalindrome = false;
					break;
				}
				i++;
			}
		}
		
			if(isPalindrome) {
				System.out.println(S + "is palindrome");
			}else {
				System.out.println(S + "is not palindrome");
			}
		}

}


