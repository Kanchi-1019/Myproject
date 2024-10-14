package aggregation;

public class Aggregation2 {
	Aggregation1 Agg;//class name.obj reference
	String Place;
	public Aggregation2(Aggregation1 Agg,String Place)
	{
		this.Agg=Agg;
		this.Place=Place;
	}
	public void display()
	{
		System.out.println(Agg.id);
		System.out.println(Agg.name);
		System.out.println(Place);
	}
	
	public static void main(String[] args) {
		
	
		Aggregation1 obj=new Aggregation1("kanchi",1);
		Aggregation2 obj1=new Aggregation2(obj,"Attingal");
		obj1.display();
				}

}
