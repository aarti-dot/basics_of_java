package Java_shammiclasses;

public class ReverseWord {
	
	    public static void main(String[] args) {
	        String word = "DAD";
	        String rd = reverseWord(word);
	        System.out.println("Original word: " + word);
	        System.out.println("Reversed word: " + rd);
	    }
	    
	    public static String reverseWord(String word) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed.append(word.charAt(i));
	        }
	        return reversed.toString();
	    }
	}



