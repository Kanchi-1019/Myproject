package operation;

import accessmodifier.HelloProject;

public class Operation {
static String g;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Operation obj=new Operation();
obj.display();
obj.display1();
obj.display2();
obj.display3();
HelloProject s=new HelloProject();
//s.display();
s.read();
//s.display1();
//s.add();
	}
void display()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Sum="+c);
}
private void display1()
{
	g="How are you";
	System.out.println("String length="+g.length());
}
protected void display3()
{
	System.out.println("Good Morning");
}
public void display2()
{
	if(g.length()>3)
	{
		System.out.println("true");
	}
	else {
		System.out.println("False");
	}
	
}
}
