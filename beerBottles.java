import java.util.Scanner;
public class beerBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bottles;
		String sentence = " bottle of beer on the wall";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many bottles do we start with");
		bottles = keyboard.nextInt();
		
		
		while  (bottles >= 1)
		{
			System.out.println(bottles + sentence);
			System.out.println(bottles + "bottles of beer");
			System.out.println("Take one down");
			System.out.println("Pass it around");
			System.out.println("");
			
			
			
			
			if(bottles > 1)
			{
				bottles--;
				System.out.println(bottles + " Bottles of beer on the wall");
				System.out.println("");
				
			}
			
			else if (bottles == 1)
			{
				System.out.println("No more bottle of beer on the wall");
				System.out.println("");
				bottles--;
			}
			
			
			
			
			
		}
		

	}

}
