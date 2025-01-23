package superkeyword;

public class ChildSuper extends ParentSuper {

	public static void main(String[] args) {
		ChildSuper obj=new ChildSuper();
	}	
		public ChildSuper()
		{
			super();//invoke the parent class constructor
			int d=a-b;
			System.out.println(d);
			System.out.println(super.a);//refer the current class variable
		System.out.println(super.b);
		super.mul();//super.method name
		}
	}


