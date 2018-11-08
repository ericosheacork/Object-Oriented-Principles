
public class Lecturer {

	private String name;
	private int id;
	private int maxBooks = 15;
	private Book[] bookList = new Book[maxBooks];
	
	public Lecturer(String n , int i )
	{
		this.name = n;
		this.id = i;
		
	}

	public String getName() 
	{
		return name;
	}
	
	public int getId() 
	{
		return id;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Book[] getBookList()
	{
		return this.bookList;
	}

	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void addBook(Book x)
	{
		for(int i = 0; i < bookList.length; i++)
		{
			if(bookList[i] == null)
			{
				bookList[i] = x;
				System.out.println("The book has been added to the list");
				break;
			}
			
			else if(i == bookList.length - 1 && bookList[19] !=null )
			{
				System.out.println("Error list is full");
			}
		}
	}
	
	public String toString()
	{
		String result = "Name: " + getName() + "\n" +   "ID: " + getId() + "\n";
	   return result;
	   
	}
	
	
	
}

