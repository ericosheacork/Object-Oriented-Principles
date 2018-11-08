
public class Player {
	
	private String name;
	private String Code;
	
	public Player()
	{
		
	}
	
	public Player(String n , String c)
	{
		this.name = n;
		this.Code = c;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getCode()
	{
		return this.Code;
	}
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCode(String c)
	{
		this.Code = c;
	}
	
	public String ToString()
	{
		String output = "Name: " + getName() + "\n" + "Code: " + getCode() + "\n";
		System.out.println(output);
		return output;
	}
	
	public String print()
	{
		String output = "Name: " + getName() + "\n" + "Code: " + getCode() + "\n";
		System.out.println(output);
		return output;
	}
	

}
