package polymorphism;

public class Poymorphism_Overriding2 extends Polymorphism_Overriding1 {

public void add()//parent and child same method name
{
	int d=a-b;
	System.out.println(d);
	super.add();// call super
}
	public static void main(String[] args) {
		Poymorphism_Overriding2 o=new Poymorphism_Overriding2();//parent class classname used
		o.add();

	}

}
