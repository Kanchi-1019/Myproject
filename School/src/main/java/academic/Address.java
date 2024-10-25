package academic;

public class Address {
	String Address;
	Student obj;
	public  Address(String Address,Student obj)
	{
		this.Address=Address;
		this.obj=obj;
		
	}

	public void display()
	{
		
		System.out.println("Name is "+obj.name);
		System.out.println("Roll no: "+obj.roll);
		System.out.println("Address is "+Address);
	}
	public static void main(String[] args) {
		Student obj1=new Student();
		obj1.details("kanchi",21);
		Address obj2=new Address("Attingal",obj1);
		obj2.display();
		
	}

}
