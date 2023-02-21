package pisal;

public class constructor2a 
{
	
	String studentname;
	int studentrollno;
	char studentgrade;
	float studentper;
	
	constructor2a(int b, char c, float d)
	{
		this("Sagar");
		studentrollno=b;
		studentgrade=c;
		studentper=d;
	}
	
	
	constructor2a(String g)
	{

	    
		
		studentname=g;
		
	}
	
	
	
	public void m1()
	{
		System.out.println(studentname);
	}
	public void m2()
	{
		
		System.out.println(studentrollno);
		System.out.println(studentgrade);
		System.out.println(studentper);
	}
	
	
	public static void main(String[] args) {
		
		constructor2a s1=new constructor2a("koustubh");
		s1.m1();
		
		
		
		constructor2a s2=new constructor2a(45,'A', 70.80F);
		s2.m1();
		s2.m2();
		
		
		
		
	}

}
