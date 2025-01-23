package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(15);
		a.add(60);
		a.add(188);
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		int length=a.size();
		System.out.println(length);
	System.out.println(a.get(2));
	boolean n=a.contains(12);
	System.out.println(n);
	Iterator it=a.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());//is use to print
	}
			
	}

}
