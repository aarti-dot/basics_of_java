 package Break_state;

public class break1 {

	public static void main(String[] args) {
		
		//outer loop
		for(int i=1; i<3; i++) {
			
			//for inner loop
			for(int j=1; j<3; j++) {
				if(i==3 && j==3)
					break;{
						System.out.println(i  + " " +  j);
					}
			}System.out.println("control cane out from the inner loop");
		}
		System.out.println("control came out from the outer loop");



	}

}
