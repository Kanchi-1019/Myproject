package multilevelinheritance;

public class ChildC extends ParentB {

	public static void main(String[] args) {
		ChildC obj=new ChildC();
		obj.add();
		obj.minus();
		obj.mul();// TODO Auto-generated method stub

	}
public void mul()
{
	int f=a*b;
	System.out.println("multipication="+f);
}
}
