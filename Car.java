import java.util.ArrayList;
import java.util.Scanner;


public class Car {
	
	private String model;
	private String make;
	private int age;
	private double price;
	
	
	
	
	
	
	public Car(String m , String mo , double p ,int a  )
	{
		this.make = m;
		this.model = mo;
		this.age = a;
		this.price = p;
		
		
	}
	
	public Car()
	{
		
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	
	
	public void setMake(String m)
	{
		this.make = m;
	}
	
	public void setModel(String mo)
	{
		this.model = mo;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
	
	public void setPrice(double p)
	{
		this.price = p;
	}
	
	
	
	
	public String toString()
	{
		String result = "Make: " + make + "\n" +   "Model: " + model + "\n" + "Price: " + price + "\n" + "Age: " + age  + "\n";
	   return result;
	   
	}
	
	public String condition_state()
	{
		
		String output = "";
		if(getAge() >= 1 && getAge() < 3)
		{
			output = model + " " + make + " is "+ age + "years old and is " + "Shiny new";
		}
		
		else if (getAge() >= 3 && getAge() < 6 )
		{
			output = model + " " + make + " is "+ age + " years old and is " + "lightly worn";
		}
		
		else if(getAge() >= 6 && getAge() < 8)
		{
			output = model + " " + make + " is "+ age + "years old and is " + "past its best";
		}
		
		else if(getAge() >= 8 && getAge() < 10)
		{
			output = model + " " + make + " is "+ age + "years old  and is " + "shows signs of age";
		}
		
		else if(getAge() >= 10)
		{
			output = model + " " + make + " is "+ age + "years old  and is " + "a banger";
		}
		return output;
	}
	
	
	
		

	
	
	
	
	
}




