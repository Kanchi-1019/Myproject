package discount;

public class Offseason extends Onseason{
	public void discount()
	{
		float c=(a/100)*15f;
		System.out.println("Off season Discount is  "+c);
//super.discount();
	}

	public static void main(String[] args) {
		Onseason obj=new Onseason();
		Onseason obj1=new Offseason();
		
		obj.discount();
		obj1.discount();

	}

}
