
public class Book {

	private String title;
	private int ISBN;
	private String author;
	private double price;
	
	
	public Book(String t , int code , String a , double p)
	{
		this.title = t;
		this.ISBN = code;
		this.author = a;
		this.price = p;
		
	}


	public String getTitle() 
	{
		return title;
	}
	
	public int getISBN()
	{
		return ISBN;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public double getPrice() 
	{
		return price;
	}


	public void setTitle(String title)
	{
		this.title = title;
	}

	public void setISBN(int iSBN) 
	{
		ISBN = iSBN;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}
	
	
	
	
}
