package pisal;

public class constructor18 {
	
	String studentname;
	int studentrollno;
	char studentgrade;
	float studentpercentage;


constructor18(String a,int b,char c,float d)
{
	studentname=a;
	studentrollno=b;
	studentgrade=c;
	studentpercentage=d;
	
}
public void m1()
{
	System.out.println(studentname);
	System.out.println(studentrollno);
	System.out.println(studentgrade);
	System.out.println(studentpercentage);
}
public static void main(String[] args) {
	constructor18 s1=new constructor18("Nishant",20,'A',80.80f);
	s1.m1();
			
}

}