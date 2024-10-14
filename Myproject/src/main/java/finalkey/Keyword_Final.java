package finalkey;

public class Keyword_Final extends Key{
final int a=20;//must give value at time of declaration in final key word
//public Keyword_Final()
//{
//	 a=30;// we can change final variable when using constructor
//}
/*public final void add() {
	final method cannot be override
}*/
	public static void main(String[] args) {
		Keyword_Final obj=new Keyword_Final();
		System.out.println(obj.a);
		obj.add();//final method can be inherited
	}
	
}
