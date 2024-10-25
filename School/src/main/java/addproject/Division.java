package addproject;

public class Division extends Addition {
	

	public Division()
	{
	System.out.println("First number is"+super.a);
	System.out.println("Second number is"+super.b);
		super.display();
		
			
	}
	public void check()
	{
		if(c%10==0)
		{
			System.out.println(c+"is divisible by 10");
		}
		else
		{
			System.out.println(c+"not divisible by 10");
		}
		
	}
	public static void main(String[] args) {
	
		Division obj=new Division();
		obj.check();
		
	}

}
