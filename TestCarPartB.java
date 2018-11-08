import java.util.ArrayList;
		import java.util.Scanner;
		
public class TestCarPartB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] carList = new Car[20];
		Car car1 = new Car("Ford" , "Focus" , 2000.99 , 4);
		car1.toString();
		car1.condition_state();
		
		Scanner keyboard = new Scanner(System.in);
		boolean process = true;
		System.out.println("Hello And Welcome would you like to input a new entry to the car database?" + "(Y/N)" );
		char answer = keyboard.next().charAt(0);
		
		if(answer == 'y')
		{
			int x = 0;
			while (process == true)
			{
				
				Scanner kb = new Scanner(System.in);
				System.out.println("Please enter the brand of car.");
				String make = kb.nextLine();
				
				
				System.out.println("Please enter the model of the car");
				String model = kb.nextLine();
				
				System.out.println("Please enter the price");
				double price = kb.nextDouble();
				
				
				System.out.println("Please enter the age of the car");
				int age = kb.nextInt();
				
				Car tempCar = new Car(make , model , price , age);
				
				carList[x] = tempCar;
				x++;
				
				System.out.println("Would you like to add another car (Y/N)");
				char z = kb.next().charAt(0);
				
				if(z == 'n')
				{
					process = false;
				}
				
					
			}
			
			
			if(process == false)
			{
				int y = 0;
				for(int i = 0; i < carList.length; i++)
				{
					if(carList[i] == null)
					{
						y++;
						
					}
					
					else
					{
						System.out.println(carList[i].condition_state());
					}
				}
				System.out.println("You have " + y + " spaces left in the databse");
			}
				
		
		}
		
		
		
		
}
}
	
/*	
The advantages of using arraylists over arrays is that the arraylist class already has methods such as get , isempty , size premade for use whereas with an array methods must be manually created.
Also arrays have fixed sizes while an arraylist doe snot therefore it can scale better.

*/

