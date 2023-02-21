package pisal;

public class constructor20a {
	String studentname;
	int studentroll;
	char studentgrade;
	float studentper;
	
	constructor20a(String a)
	{
		studentname=a;
		
	}
	constructor20a(int b, char c, float d)
	{
		this("koustubh");
		studentroll=b;
		studentgrade=c;
		studentper=d;
	
		
	}
	constructor20a()
	{
		this(43,'a',78.90f);
		studentname="Ashish";
		studentroll=21;
		studentgrade='c';
		studentper=75.80f;
		
	
	}
	public void m1()
	{
		System.out.println(studentname);
	}
	public void m2()
	{
		System.out.println(studentroll);
		System.out.println(studentgrade);
		System.out.println(studentper);
	}
	public void m3()
	{
		System.out.println(studentname);
		System.out.println(studentroll);
		System.out.println(studentgrade);
		System.out.println(studentper);
	}
	public static void main(String []args)
	{
		constructor20a s1=new constructor20a("Vishal");
		s1.m1();
		
		constructor20a s2=new constructor20a(45,'A',80.75f);
		s2.m2();
		s2.m1();
		
		constructor20a s3=new constructor20a();
		s3.m3();
		s3.m2();
				
	}

}
