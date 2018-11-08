
public class Flea {

	private String name;
	private int age;
	private Dog host;
	
	public Flea(String n , int a , Dog h)
	{
		this.name = n;
		this.age = a;
		this.host = h;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public void setHost(Dog h)
	{
		this.host = h;
				
	}
	
	public Dog getHost()
	{
		return this.host;
	}
	
}
