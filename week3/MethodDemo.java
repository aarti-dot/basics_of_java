package week3;

public class MethodDemo
{
	public void show()
	{
		
		System.out.println("This is instance method");
		
	}

	public static void display()
	
	{
		
		System.out.println("This is a static method");
		
	}
	public static void main(String[] args)
	{
		display();
		
		MethodDemo m1=new MethodDemo();
		m1.show();
		display();
		
		
		

	}

}
