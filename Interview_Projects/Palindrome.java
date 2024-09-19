package Interview_Projects;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "Level";
		
		boolean isPalindrome = true;
		for(int i = 0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				isPalindrome = false;
				break;
			}
		}if(isPalindrome) {
			System.out.println(s + " String is palindrome");
		}else {
			System.out.println(s + " String is not palindrome");
		}

	}

}
