package Interview_Projects;
import java.util.HashMap;
import java.util.Map;

public class Duplicate_words {
	
	

	
	    public static void main(String[] args) {
	        String[] words = {"Apple", "Apple", "cherry", "cherry", "Mango"};

	        
	        Map<String, Integer> dw = new HashMap<>();       // Create a HashMap to store word counts

	        for (String word : words) {                               // Iterate through the array and count occurrences of each word
	            
	        int count = dw.getOrDefault(word, 0);             // Get the current count of the word, default to 0 if not present
	           
	         dw.put(word, count + 1);                            // Increment the count and put it back into the map
	        }

	        for (Map.Entry<String, Integer> entry : dw.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}



