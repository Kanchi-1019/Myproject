package exception;

public class Else
{
	int a=1;
	public void check() 
	{
		if(a>=18)
		{
			System.out.println("Valid");
			
		}
		else
		{
			//System.out.println("not valid");
		throw new  ArithmeticException("Not eligible");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Else obj=new Else();
obj.check();

	}

}
