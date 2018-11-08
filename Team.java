import java.lang.reflect.Array;
import java.util.Arrays;

public class Team {

	private String name;
	private String jersey;
	private String location;
	private Player playerList[] = new Player[20];
	
	public Team(String n , String j , String l)
	{
		this.name = n;
		this.jersey = j;
		this.location = l;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getJersey()
	{
		return this.jersey;
	}
	
	public String getLocation()
	{
		return this.location;
	}
	
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void getJersey(String j)
	{
		this.jersey= j;
	}
	
	public void getLocation(String l)
	{
		this.location = l;
	}
	
	
	public void addPlayer(Player PL)
	{
		 
		for(int i = 0; i < 3; i++)
		{
			if(playerList[i] == null)
			{
				this.playerList[i] = PL;
				break;
			}
		}
	}
	
	public Player[] getPlayer()
		{
			return playerList;
		}
		
	
	
	public String toString()
	{
		return "Name: "+ getName() + "\n" + "Jersey: " + getJersey() + "\n" + "Location: " + getLocation() + "\n";

	}
	
	public Player print()
	{
		Player P = new Player();
		System.out.println(toString() + "\n");
		for(int i = 0; i < 3; i++ )
		{
			
			P = this.playerList[i];
			
			System.out.println("Name: " + P.getName() + "\n" + "Code: " + P.getCode() + "\n");
			
		}
		return P;
	}
	
}
