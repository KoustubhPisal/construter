package pisal;

public class constructor1 {
	public static void main(String[] args) {
		
		
			constructor1 s1=new constructor1();
			s1.m1();
			s1.m2();
			s1.m3();
		}
	int a;
	int b;
	
	constructor1()
	{
		a=16;
		b=8;
	}
		public void m1()
		
		 
		 {
		int c=a*b;
		System.out.println(c);
	}
		public void m2()
		{
			int d=a+b;
			System.out.println(d);
		}
		public void m3()
		{
			int e=a-b;
			System.out.println(e);
			
		}

}

