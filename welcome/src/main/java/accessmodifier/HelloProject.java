package accessmodifier;

public class HelloProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HelloProject s=new HelloProject();
s.display();
s.read();
s.display1();
s.add();
	}

 void display()
{
	System.out.println("Hello World");
}
public void read()
{
	System.out.println("Welcome");
}
protected void display1()
{System.out.println("Good Morning");
}
private void add()
{
	System.out.println("Hai");

}


}
