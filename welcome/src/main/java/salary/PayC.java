package salary;

public class PayC extends PayB{

	public static void main(String[] args) {
		PayC obj=new PayC();
		obj.total1();
		obj.per();
		
		obj.total();
		
	}
public void total()
{
	d=(a+c+hra)-(b+pf);
	System.out.println("Salary on Hand="+d);
}
}