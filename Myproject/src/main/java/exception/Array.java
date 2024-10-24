package exception;

public class Array {

public void check()
{

int a[]= {0,1,2,3,4,5,6};
int arr[]=null;
	
		try {
		float b=(a[5])/2
				;
		System.out.println("Answer is  "+b);
		System.out.println("the length of arrar="+arr.length);
		}
		catch(ArithmeticException e){
			System.out.println("enter the valid input");
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("Entered no.is out of the index");
		}
		catch(NullPointerException e2) {
			System.out.println("Exception");
}
		finally {
			System.out.println("Thank you");
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array obj=new Array();
obj.check();
	}

}
