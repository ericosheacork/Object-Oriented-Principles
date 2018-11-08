
public class Dog {

	private String name;
	private String address;
	private int age;
	private Flea[] fleaCollection = new Flea[20];
	
	public Dog()
	{
		
	}
	public Dog(String n , String ad  , int a)
	{
		this.name = n;
		this.address = ad;
		this.age = a;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setAddress(String ad)
	{
		this.address = ad;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public void addFlea(Flea x)
	{
		for(int i = 0; i < fleaCollection.length; i++)
		{
			if(fleaCollection[i] == null)
			{
				fleaCollection[i] = x;
			}
			
			else if(fleaCollection[19] != null)
			{
				System.out.println("No more room for fleas");
			}
		}
	}
	
	public void removeFlea(int i)
	{
		fleaCollection[i] = null;
		
		if(fleaCollection[i] == null)
		{
			System.out.println(getName() +  "shook the flea off");
		}
	}
	
	public String bark()
	{
		String s = "Bark";
		return s;
	}
	
	
}
