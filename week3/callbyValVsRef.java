package week3;

public class callbyValVsRef 
{
	public void callbyvalue(int a)
	
	{
		System.out.println("call by value() : " +a) ;
		
	}
	public void callbyref(callbyValVsRef cc)
	{
		cc.callbyvalue(900);
		
	
	}
	
	public static void main(String[] args)
	{
		callbyValVsRef c1=new callbyValVsRef();
		c1.callbyvalue(500);
		
		c1.callbyref(c1);

	}

}
