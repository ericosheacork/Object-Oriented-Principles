
public class MainTest {
	public static void main(String[] args)
	{
		Player p1 = new Player("Pakie Bonner" ,"PB" );
		Player p2 = new Player("Seamus Coleman" , "SC");
		Player p3 = new Player("Robbie Keane" ,"RK");
		Player p4 = new Player("Liam Miller" , "LM");
		Player p5 = new Player("Lionel Messy" , "LM");
		Player p6 = new Player("Cristiano Ronaldo" , "CR");
		Player p7 = new Player("Diego Maradonna" , "DM");
		
		Team MyVeryBestIrish = new Team("Best Irish" , "red Jersey" , "Cork");
		Team MyVeryBestWorld = new Team("Best World" , "blue jersey" , "Dublin");
		
		MyVeryBestWorld.addPlayer(p1);
		MyVeryBestWorld.addPlayer(p2);
		MyVeryBestWorld.addPlayer(p3);
		MyVeryBestWorld.print();

		
	
	}

}
