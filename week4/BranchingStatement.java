package week4;

public class BranchingStatement 
{
	public String details()
	{
		return "control flow statement complete";
		
	}

	public static void main(String[] args)
	{
		BranchingStatement B1=new BranchingStatement();
		String msg=B1.details();
		System.out.println(msg);
		System.out.println("**************************");
				
	}
	{
		for(int i=1;i<=10;i++)
		{
			if (i==7)
			{
				//break;
				continue;
	
				
				
			}else
			{
				System.out.println(i);
				
			}
		
			
			
		}System.out.println("Done");

	}

}
