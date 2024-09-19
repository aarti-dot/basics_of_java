package Java_shammiclasses;

public class Vowel
{
    public static void main(String[] args) {
    	
        String word = "aarti";
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Convert the word to lowercase to simplify counting
       // word = word.toLowerCase();
        
        // Loop through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
            // Check if the character is an alphabet (excluding vowels)
            else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}




