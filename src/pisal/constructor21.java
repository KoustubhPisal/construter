package pisal;

public class constructor21 {
	int a;
	int b;
	
	constructor21()
	{
		this(20,30);
	}
	constructor21(int x)
	{
	}
	constructor21(int c,int d)
	{
		a=c;
		b=d;
  
}
	public void m1()
	{
	int e=a*b;
	System.out.println(e);
}
	public static void main(String []args)
	{
		constructor21 s1=new constructor21(25,25);
		s1.m1();
	}
}
