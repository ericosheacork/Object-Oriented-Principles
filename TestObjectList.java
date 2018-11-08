
public class TestObjectList {
	
	/**
	 * Write a description of class TestObjectList here.
	 * 
	 * @author (Eric O Shea) 
	 * @version (17/10/2018)
	 */
	   public static void main(String[] args)
	   {
	       ObjectList ol = new ObjectList(3); // creating a new list of objects of length 3. (of an undefined type?)
	       
	       String s = "Im Happy"; //creating a string s
	       Dog d = new Dog(); // creating a new object of type dog
	       DVD v = new DVD(); // creating a new object of type dvd
	       Integer i = 1234; //creating a primitive datatype of type int in the Integer wrapper class
	       ol.add(s);
	       ol.add(d);
	       
	       //System.out.println(ol.add(s));// invoking the add method for the object to add string s to the list and printing it to the command line for the user to see 
	       //System.out.println(ol.add(d)); //  invoking the add method for the object to add Dog d to the list and printing it to the command line for the user to see 
	       //System.out.println(ol.add(v)); // invoking the add method for the object to add DVD v to the list and printing it to the command line for the user to see 
	       //System.out.println(ol.add(i));// list is full at this point and will failinvoking the add method for the objectlist to add i to the list and printing it to the command line for the user to see
	       
	      ol.remove(0); // invoking the remove method for theb object list and removing the entity that is at position 0 of the list.
	     // System.out.println(ol.add(i));  // should fail as add returns void  invoking the add method for the object to add integer i to the list and printing it to the command line for the user to see 
	       
	       
	       System.out.println("Is the list full? "+ ol.isFull()); //invoking the isFull method to check if the object List is full // 
	       System.out.println("Is the list empty? "+ ol.isEmpty()); // invoking the isEmpty method which checks if the object list is empty
	       
	       System.out.println("Total number of objects in the list: " + ol.getTotal());// invoking the getTotal method to return the total number of objects in the list requires a list object to call from 
	       
	       Object g = ol.getObject(1); // setting an object named g to the value of the first index of the object ArrayList.
	       //g.bark(); // trying to invoke the bark method in the dog class for the object g. this will fail as g is a dvd object.
	       
	   }
	}



