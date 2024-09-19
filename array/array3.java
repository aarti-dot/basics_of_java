package array;

public class array3 {
	
	static int c[]= {22, 18, 23, 12};
	
	public static void PassinArrayToMethod() {
		
		int b = c[0]; // 22
	
		for(int i=0; i<c.length; i++) {
			if(b>=c[i]) {
				System.out.println(b);
			}else {
				System.out.println("ABC");
			}
	}

	}public static void main(String[] args) {
		PassinArrayToMethod();
	}

	}


