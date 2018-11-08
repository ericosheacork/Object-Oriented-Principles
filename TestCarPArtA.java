import java.util.Scanner;
public class TestCarPArtA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean process = true;
		String[] car_make = new String[20];
		String[] car_model = new String[20];
		int[] age_of_car = new int[20];
		double[] price_of_car = new double[20];
		
		car_make[0] = "honda";
		car_model[0] = "accord";
		age_of_car[0] = 7;
		price_of_car[0] = 2500.59;
		
		
		
		
		
		
		
		
		
		
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hello And Welcome would you like to input a new entry to the car database?" + "(Y/N)" );
		char answer = keyboard.next().charAt(0);
		
		if(answer == 'y')
		{
			while (process == true)
			{
				
				System.out.println("Please enter the brand of car.");
				
				String make = keyboard.next();
				keyboard.nextLine();
				for(int i = 0; i < car_make.length; i++)
				    if(car_make[i] == null) 
				    {
				        car_make[i] = make;
				        break;
				    }
				
				
				System.out.println("Please enter the model of the car");
				
				String model = keyboard.next();
				for(int i = 0; i < car_model.length; i++)
				    if( car_model[i] == null) 
				    {
				    	car_model[i] = model;
				        break;
				    }
				
				System.out.println("Please enter the age of the car");
				
				int dob = keyboard.nextInt();
				for(int i=0; i < age_of_car.length; i++)
				    if(age_of_car[i] == 0) {
				    	age_of_car[i] = dob;
				        break;
				    }
				
				System.out.println("Please enter the price");
				
				double price = keyboard.nextDouble();
				for(int i=0; i < price_of_car.length; i++)
				    if(price_of_car[i] == 0) {
				    	price_of_car[i] = price;
				        break;
				    }
				
				
				System.out.println("Would you like to add another car to the system?");
				char answer_2 = keyboard.next().charAt(0);
				
				if(answer_2 == 'y')
				{
					process =true;
				}
				
				else if(answer_2 != 'y')
				{
					process = false;
				}
			
			}
			
		}
		
		if(answer == 'n' || process == false)
		{
			System.out.println("Would you like to view the database? " + "(Y/N)");
			char answer_3 = keyboard.next().charAt(0);
			
			
			if(answer_3 == 'y')
			{
				
				System.out.println("Here are all the current entries");
				
				for(int i = 0; i <= 20; i++)
				{
					if(car_make[i] != null)
					{
					System.out.println("Make: " + car_make[i]);
					System.out.println("Model " + car_model[i]);
					System.out.println("Age: " + age_of_car[i]);
					System.out.println("Price: " + price_of_car[i]);
					}
					
					else if(car_make[i] == null)
					{
						break;
					}
						if(i ==20)
						{
							break;
						}
				}
				
			}
			
			else if(answer_3 == 'n')
			{
				System.out.println("Ok Goodbye");
			}
			
			
		}
		
		

	}

}
