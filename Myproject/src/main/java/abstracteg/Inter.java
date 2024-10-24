package abstracteg;

public class Inter implements Interfac1,Parent {

	public static void main(String[] args) {
		Inter obj=new Inter();
		obj.display();
		obj.read();
		obj.show();
		// TODO Auto-generated method stub

	}
	public void read()
	{
		int c=a+b;
		System.out.println(c);
	}
	public void display()
	{
		System.out.println("Hello world.......");
	}
	@Override
	public void show() {
		System.out.println("java powerfull");// TODO Auto-generated method stub
		
	}

}
