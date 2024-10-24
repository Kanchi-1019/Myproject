package encapsulation;

public class Encap1 {
private int id;
private String name;
public void setter(int id,String name)
{
	this.name=name;
	this.id=id;
}
public void getter()
{
	System.out.println(id);
	System.out.println(name);
}
}
