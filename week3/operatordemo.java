package week3;

public class operatordemo {

	public static void main(String[] args)
	{
		//arithmetic operator
		
		int a=100, b=20;
		
		System.out.println("addition is :"+(a+b));
		System.out.println("substracrion is :"+(a-b));
		System.out.println("division is :"+(a/b));
		System.out.println("multiplication is :"+(a*b));
		System.out.println("modulus is :"+(a%b));
		
		//++ increment --decrement
		// post increment
		
		int c=a++;;
		System.out.println(c);
		System.out.println(a);
		System.out.println("*********");
		
		
		int x=88;
		int y=x++;
		System.out.println(y);
		System.out.println(x);
		System.out.println("***********");
		
		
		int p=10;
		int q=p++;
		System.out.println(q);
		System.out.println(p);
		System.out.println("************");
		
		// pri increment
		
		int m=66;
		int n=++m;
		System.out.println(n);
		System.out.println(m);
		
		
		int s=100;
		int t=++s;
		System.out.println(t);
		System.out.println(s);
		
		
		int e=-20;
		int f=++e;
		System.out.println(f);
		System.out.println(e);
		
		System.out.println("************");
		
		// post decrement  
		
		int a1=20;
		int b1=a1--;
		System.out.println(b1);
		System.out.println(a1);
		
		
		int x1=40;
		int y1=x1--;
		System.out.println(y1);
		System.out.println(x1);
		System.out.println("***************");
		
		//pre decrement
		int p1=50;
		int q1=--p1;
		System.out.println(q1);
		System.out.println(p1);
		System.out.println("****************");
		// Relational operator
		// relational result always in boolean
		System.out.println(a>b);//true
		System.out.println(b<a);
		System.out.println(p1>a);
		System.out.println(x1>a);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(p1<=q1);
		System.out.println(p1==q1);
		System.out.println(p1!=q1);
		System.out.println(a!=b);
		
		System.out.println("**************");
	
		System.out.println((a>b)&&(b<a));//true
		System.out.println((a>b)&&(b>a));//false
		System.out.println((a>=b)&&(b<=a));//true
		System.out.println("**************");
		
		System.out.println((a<b)||(b<a));//true
		System.out.println((b>a)||(a<b));//false
		
		//boolean !not
		
		boolean xx=true;
		System.out.println(xx);
		System.out.println(!xx);
		
		//conditional operator
		if (a>b)
		{
		System.out.println(a+"is greater");
		}
		else
		{
			System.out.println(b+"is greater");
		
		}
		
		System.out.println(a>b?a+ "is greater":b+ "is greater");

		System.out.println(b<a?b+ "is smaller" :a+ "is smaller");
		
				
		
	
		
		
		
		
	
		
		
		
		

		
		

		
		
	
		
		
		
	
	}

}
