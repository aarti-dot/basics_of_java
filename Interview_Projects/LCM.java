package Interview_Projects;

public class LCM {

	public static void main(String[] args) {
		
		int a= 15;
		int b= 25;
		
		int res = (a>b)?a:b;
		while(true) {
			if(res % a==0 && res % b==0)
				break;
			res++;
		}System.out.println("LCM of " + a + " and " + b +" : " + res);
		
		

	}

}
