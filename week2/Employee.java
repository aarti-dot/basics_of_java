package week2;

public class Employee {
	
	
	int eid;
	String name;
	
	//Method
	public void display() 
	{
		
		System.out.println("Employee id is:"+eid);
		System.out.println("Employee name is:"+name);
		
		
		
	}
	public static void main(String[] args)
	{
	
	Employee empl=new Employee();
	empl.display();
	empl.eid=101;
	empl.name="Ram";
	empl.display();
	
	System.out.println("*************");
	
	
	Employee emp2=new Employee();
	emp2.display();
	emp2.eid=102;
	emp2.name="shyam";
	emp2.display();
	
	
	System.out.println("**************");
	
	Employee emp3=new Employee();
	
	emp3.display();
	emp3.eid=103;
	emp3.name="Seeta";
	emp3.display();
	
	System.out.println("***************");
	
	Employee emp4=new Employee();
	emp4.eid=104;
	emp4.name="Reeta";
	emp4.display();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		// TODO Auto-generated method stub

	}

}
