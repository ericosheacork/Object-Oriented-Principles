import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class TestCarPartC {
	
	public static void  main(String[] args)
	{
	ArrayList <Car> carList = new ArrayList<Car>();
	Scanner kb = new Scanner(System.in);
	int selection = 0;
	boolean check = true;
	
	while (check)
	{
		
	System.out.println("Please pick an option:");
	System.out.println("1.Add a car.");
	System.out.println("2 remove a car");
	System.out.println("3 view list of cars");
	System.out.println("4 exit:");
	selection = kb.nextInt();
	
	
	
		if(selection == 1)
		{
			Scanner keyboard = new Scanner(System.in);
			boolean check2 = true;
			System.out.println("Please enter the make of the car:");
			String make = keyboard.nextLine();
			
			System.out.print("Please enter the model of the car:");
			String model = keyboard.next();
			
			System.out.println("Please enter the price of the car:");
			Double price = kb.nextDouble();
			
			System.out.println("How old is the car?:");
			int age = kb.nextInt();
			
				
			Car tempCar = new Car(model , make , price , age);
			System.out.println("Ok here are the details: " + tempCar.condition_state());
			
					
			carList.add(tempCar);
			System.out.println("The Car was Added to the List Successfully" + "\n");
				
				
			}
		
		else if(selection == 2)
		{
			if(carList.isEmpty())
			{
				System.out.println("Unable to remove car as list is empty");
			}
			
			else
			{
				int remove = 0;
				System.out.println("Which element would you like to remove?:");
				for(int i = 0; i <= carList.size() - 1; i++)
				{
					if(carList.get(i) == null)
					{
						break;
					}
					
					else
					{
						System.out.println(carList.get(i));
					}
					
				}
				
				remove = kb.nextInt();
				carList.remove(remove - 1);
				
				
			}
		}
		
		else if(selection == 3)
		{
			if(carList.isEmpty())
			{
				System.out.println("List is Empty");
			}
			else
			{
				for(int i = 0; i <= carList.size() - 1; i++)
				{
					System.out.println(carList.get(i));
				}
			}
		}
		
		else if (selection == 4)
		{
			
			System.out.println("Goodbye");
			check = false;
			
		}
	
	
	}
	}	
	
}
