package week3;

public class parameterpassing 
{
	public void add()
	{
	
	int a=10,b=30;
	System.out.println("Parameter passing without return");
	
	System.out.println("addition is " +(a+b));
	}
	public void sub(int a, int b)
	{
		System.out.println("substraction is " +(a-b));
	}
	public void mul(int a, int b)
	{
		System.out.println("multiplication is " +(a*b));
		
	}
	public void div(int a, int b)
	{
		System.out.println("division is " +(a/b));
		
	}
	public void mod(int a, int b)
	{
		System.out.println("modulation is "+(a%b));
		System.out.println("*************************");
		
	}
	public void add1()
	
	{
		int x=400,y=20;
		System.out.println("**************************");
		
	}
	{
		
	}
	
	public int add1(int x, int y)
	
	{
	return x+y;
	}
	
	
		public int sub1(int x, int y)
		{
		
	return x-y;
	}
	public int mul1(int x, int y)
		
	
	{
		return x*y;
	}
		public int div1(int x, int y)
		{
			return x/y;
			
		}
		public int mod1(int x, int y)
		{
			return x%y;
			
		}

		
		
		
	public static void main(String[] args)
	{
	

	parameterpassing p1=new parameterpassing();
	p1.add();
	p1.sub(100,50);
	p1.mul(10,8);
	p1.div(100,20);
	p1.mod(60, 3);
	p1.add1(400,20);
	
	parameterpassing p2=new parameterpassing();
	p2.add1();
	p2.sub1(400, 20);
	p2.mul1(400,20);
	p2.div1(400,20);
	p2.mod1(400, 20);
	
	
	
	
	int result=p2.add1(400,20);
	int result1=p2.sub1(400,20);
	int result2=p2.mul1(400,20);
	int result3=p2.div1(400,20);
	int result4=p2.mod1(400,20);
	
	System.out.println("Parameter passing with return");
	
	System.out.println("addition is " +result);
	System.out.println("substraction is " +result1);
	System.out.println("multiplication is " +result2);
	System.out.println("division is " +result3);
	System.out.println("modulation is " +result4);
	}
	
	}
	
	
			
		
		

	


