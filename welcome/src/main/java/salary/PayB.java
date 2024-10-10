package salary;

public class PayB extends PayA {
	int hra;
	int pf;
	
	public void per()
	{
		hra=(a/100)*5;
		System.out.println("HRA="+hra);
		pf=(a/100)*20;
		System.out.println("PF="+pf);
	}

}
