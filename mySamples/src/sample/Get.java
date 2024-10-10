package sample;

public class Get {

	public static void main(String[] args) {
		double x=Get1.display();
		System.out.println(x);
		Vote obj1= new Vote();
		obj1.vote();
	}
class Get1
{
	static double display()
	{
		return 3.14;
	}
}
}