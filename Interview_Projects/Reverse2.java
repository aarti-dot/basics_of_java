package Interview_Projects;

public class Reverse2 {

	public static void main(String[] args) {
		
		String s = "Selenium";
		s.toLowerCase();
		int num = s.length()-1;
		String res = "";
		
		for(int i=num;i>=0; i-- ) {
			res=res+s.charAt(i);
		}
		System.out.println(res);

	}

}
