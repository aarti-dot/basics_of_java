package Interview_Projects;

public class Occurance2 {

	public static void main(String[] args) {
		String ph = "Selenium support, selenium programme, selenium webdriver, selenium java";
		ph.toLowerCase();
		String sn= "selenium";
		int count = 0;
		
		for(int i =0; i<=ph.length();i++) {
			if(ph.substring(i)==sn);
			count++;
		}
		System.out.println(count);

	}

}
