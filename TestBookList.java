
public class TestBookList {
	  public static void main(String[] args)
	   {
		  ObjectList bl = new ObjectList(3);
		  
		 Book book1 = new Book("Faust", 83192 , "Van Goethe" , 55);
		 Book book2 = new Book("1984" , 83144 , "George Orwell" , 12.50);
		 Book book3 = new Book("Ready Player One" , 83122 , "Ernest cline" , 17.99);
		 Book book4 = new Book("SDCG" , 83111 , "John Sonmez" , 32.99);
		 
		 bl.add(book1);
		 System.out.println(bl.getObject(0));
		 bl.add(book2);
		 System.out.println(bl.getObject(1));
		 bl.add(book3);
		 System.out.println(bl.getObject(2));
		 bl.add(book4);
		 System.out.println(bl.getObject(3));
		 
		  
	   }

}
