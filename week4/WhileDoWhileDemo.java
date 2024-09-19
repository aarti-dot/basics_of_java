package week4;

public class WhileDoWhileDemo {

	public static void main(String[] args)
	{
		int i=1;
		while(i<=5)
			//if we dont give c++ condition the result is infinite
		{
			System.out.println("Hello");
			i++;
		}
		System.out.println("**********************");
		
		int j=1;
		while(j<=100)
		{
			System.out.println(j);
			j++;
		}
		System.out.println("*****************");
		
		int num=10;
		while (num>1)
		{
			System.out.println(num);
			num--;
			
		}
		
		System.out.println("*********************");
		
		int x=1;
		do
		{
			System.out.println("Hello");
			x++;
			
		}while(x<=5);
		
		

		
	}

}
