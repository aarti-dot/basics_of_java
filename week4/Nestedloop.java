package week4;

public class Nestedloop {

	public static void main(String[] args)
	{
		//for(int num=1;num<=10;num++)
			
		//	for(int i=1;i<=10;i++)
			{
			//	System.out.print(num*i+"\t");
				
			}
	//	System.out.println();
	
		
	//	for (int num=1;num<=10;num++)
		{
		//	for (int i=1;i<=10;i++)
			{
			//	System.out.print(num*i+"\t");
			}
		//	System.out.println();
			
			//System.out.println("********************");
			
			
			for(int r=1;r<=4;r++)
			{
				for(int c=1;c<=4;c++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			System.out.println("***********************");
			
			for(int r=1;r<=4;r++)
			{
				for(int c=1;c<=r;c++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
					
			}System.out.println("*********************");
			
			for(int r=1;r<=4;r++)
			{
				for(int c=4;c>=r;c--)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			
			System.out.println("**********************");
			
			for (int x=1;x<=10;x++)

			{
				if(x>=3)
				{
					System.out.print(x);
				}else
				{
					System.out.println(x);
					
				}
			}


	
		}
		}

}
