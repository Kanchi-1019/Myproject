package abstracteg;

public class Sample implements Parent {

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.display();
		
Parent obj1=new Sample();//interface object creation using class
obj1.show();
obj1.read();

	}
	
	public void display()
	{
		System.out.println("hello");
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("java");
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Java World");
	}

}
