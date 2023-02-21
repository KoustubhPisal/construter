package pisal;

public class constructor2 {
	
		
		int a;
		int b;
		constructor2()
		{
			a=12;
			b=12;
		}
		public void m1()
		{
		    int c=a*b;
			System.out.println(c);
		}
		public static void main(String[] args) {
		   
			constructor2 s1=new constructor2();
			s1.m1();
		}
	}


