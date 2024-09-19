package week3;

public class methodchaning 


{
	public methodchaning startApp()
	

	{
		System.out.println("Application start.....");
		return this;
		
	}
	public methodchaning runApp()
	{
		System.out.println("Application execute.....");
		return this;
		
		
	}
	
	public methodchaning stopApp()
	{
		System.out.println("Application stop....");
		return this;
		
	}
	
	
	

	public static void main(String[] args)
	{
		
		methodchaning m1=new methodchaning();
		//m1.startApp();
		m1.startApp().runApp().stopApp().startApp().runApp();
		
		
		
	}

}
