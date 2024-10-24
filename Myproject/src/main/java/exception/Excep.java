package exception;

public class Excep {
	public void div()
	{
		try
		{
		int a=10;
		
		int c=a/0;
	System.out.println(c);
	}
	catch(ArithmeticException b)//exception is to pasted from the compile time error
		{
			System.out.println("Exceptional handing"+b);
		}
		finally
		{
			System.out.println("hello Java");
		}
	}
	public static void main(String[] args) {
Excep obj=new Excep();
obj.div();
	}

}
