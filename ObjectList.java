import java.util.ArrayList;
public class ObjectList {
	private int length;
	private 
	
	public ObjectList(int i)
	{
		this.length = i;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public void setLength(int i)
	{
		this.length = i;
	}

	
	
	
	public void add(Object x)
	{
		String s = "";
		if(list.size() < getLength())
		{
			for(int i = 0; i < getLength() - 1; i++)
			{
				if(list.get(i) == null)
				{
					list.add(i , x);
					System.out.println( x + " Has been added to the object list");
				}
				
				else
				{
					System.out.println("Error list is Full");
				}
			}
		}
		
		
	}
	
	
	public void remove(int i)
	{
		if(list.get(i) != null)
		{
			list.remove(i);
		}
		
		else
		{
			System.out.println("Error list entry is empty");
		}
	}
	
	public String isFull()
	{
		String output = "";
		
		if(list.size() == getLength() )
		{
			output = "The Stack is Full";
		}
		
		else
		{
			output = "No the stack is not full you have " + (list.size() - getLength() + " spaces left");
		}
		
		return output;
	}
	
	
	
	public String isEmpty()
	{
		String output = "";
		if(list.isEmpty())
		{
			output = "The list is empty";
		}
		
		else
		{
			output = "The list is not empty";
		}
		
		return output;
		
	}
	
	
	public int getTotal()
	{
		int i = 0;
		i = list.size();
		return i;
	}
	
	public Object getObject(int i)
	{
		Object x = null;
		
		if(list.isEmpty())
		{
			System.out.println("Error List is empty");
		}
		
		else
		{
			x = list.get(i);
			System.out.println(list.get(i));
		}
		
		return x;
		
	}
	 
}
