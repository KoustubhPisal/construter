package pisal;

public class costructor19 {
	
	int a;
	int b;
	String studentname;
	int studentroll;
	char studentgrade;
	float studentper;
	
	costructor19()
	{
		a=10;
		b=20;
	}
	costructor19(int g,int h)
	{
		a=g;
		b=h;
	}
	
	costructor19(String a, int b, char c, float d)
	
	{
		studentname=a;
		studentroll=b;
		studentgrade=c;
		studentper=d;
		
		
	}
	public void m2()
	{
		int c=a*b;
		System.out.println(c);
	}
	public void m1()
	{
		System.out.println(studentname);
		System.out.println(studentroll);
		System.out.println(studentgrade);
		System.out.println(studentper);
	}
	public static void main(String []args)
	{
		costructor19 s1=new costructor19("Vishal Shinde",23,'A',80.90F);
		s1.m1();
		
		costructor19 s2=new costructor19();
				s2.m2(); 
				costructor19 s3=new costructor19(32,3);
				s3.m2();
	}
	

		
		 
	}


