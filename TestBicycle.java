
public class TestBicycle {
	
	 public static void main(String[] args)
	    {
	        Bicycle bike1 = new Bicycle(); // creating a new object of the type bicycle 
	        bike1.setSpeed(100); // using the accessor/setter to set the speed of the bike1 object to 100
	        bike1.setMaker("Raleigh"); // using the accessor/setter to set the make of the bike1 object
	        bike1.setType("Mountain Bike"); // // using the accessor/setter to set the type of the bike1 object ALSO ERROR NO SEMICOLON
	        bike1.print(); // invoking the print method of the bike class
	        
	        Bicycle bike2 = new Bicycle(10,"Home Made", "Bone Shaker"); // creating a new object 
	        bike2.print();//error what is it calling / fixed to call bike2 object
	    }
	  
	}


