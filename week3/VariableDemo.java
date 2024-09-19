package week3;

public class VariableDemo 
{
	int id=10;
	String name="pooja";
	static String cname="Fergussan";
	
	
	public void show()
	
	{
		int marks=30;// local
		System.out.println("show()"+marks);
		System.out.println("id is"+id)	;
		System.out.println("cname is"+cname);
		
		
	}
	
		public void display()
		{
		
			int marks=40;
			System.out.println("display()"+marks);
			System.out.println("name is"+name);
			System.out.println("cname is"+cname);
		}
		
	public static void main(String[] args)
	{
	VariableDemo v1=new VariableDemo();
	v1.show();
	v1.display();
	
	int marks=100;
	System.out.println("main()"+marks);
	System.out.println("id is"+v1.id);
	System.out.println("cname is"+cname);

	}

}
