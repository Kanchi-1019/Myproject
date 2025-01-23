package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(12);
		a.add(56);
		a.add(78);
		a.add(45);
		a.add(23);
		System.out.println(a);//o/p is [12,56,78,45,23]
		// TODO Auto-generated method stub
		a.remove(1);
		System.out.println(a);//[12, 78, 45, 23]
		int lenght=a.size();
		System.out.println(lenght);//4
		System.out.println(a.get(2));//45
		boolean n=a.contains(12);
		System.out.println(n);//true
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
