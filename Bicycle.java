
public class Bicycle {

	private int speed;
	private String maker;
	private String type;
	
	
	public Bicycle()
	{
		
	}
	
	public Bicycle(int s, String m , String t )
	{
		this.speed = s;
		this.maker = m;
		this.type = t;
	}
	
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public String getMaker()
	{
		return this.maker;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setSpeed(int s )
	{
		this.speed = s;
	}
	
	public void setMaker(String m)
	{
		this.maker = m;
	}
	
	public void setType(String t)
	{
		this.type = t;
	}
	
	
	public String print()
	{
		System.out.print("Speed: " + speed + "\n" + "Make: " + maker + "\n" + "Type: " +  type + "\n");
		return "Speed: " + speed + "\n" + "Make: " + maker + "\n" + "Type: " +  type;
	}
}
