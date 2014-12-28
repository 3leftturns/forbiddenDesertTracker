import java.util.Scanner;


public class UserInterface {
	Scanner in = new Scanner(System.in);
	public void mainMenu(Deck d){
		boolean done = false;
		int result;
		while (!done){
			System.out.println("Forbidden Desert Deck Predictor");
			System.out.println("Make a selection below.");
			System.out.println("1) Sun Beats Down Card");
			System.out.println("2) Storm Picks Up Card");
			System.out.println("3) Storm Movement Card");
			System.out.println("4) Exit");
			result = in.nextInt();
			switch (result) {
			case 1: 
				d.useSunBeatsDown();
				printOdds(d);
				break;
				
			case 2:
				d.useStormPicksUp();
				printOdds(d);
				break;
				
			case 3:
				d.useStormMoves();
				printOdds(d);
				break;
			case 4:
				done = true;
				break;
			}
		}
	}
	
	public void printOdds(Deck d){
		System.out.println("\nOdds of Survival:");
		System.out.println("========================================");
		
		System.out.println("     Odds of drawing Sun Beats Down: " + (int)d.calculateOddsSunBeatsDown(d.getSunBeatsDown(), d.getDeckTotal()) + "%");
		System.out.println("      Number of Sun Beats Down Left: " + d.getSunBeatsDown());
		System.out.println("     Odds of drawing Storm Picks Up: " + (int)d.calculateOddsStormPicksUp(d.getStormPicksUp(), d.getDeckTotal()) + "%");
		System.out.println("      Number of Storm Picks Up Left: " + d.getStormPicksUp());
		System.out.println("Number of Storm Movement Cards Left: " + d.getStormMoves());
		System.out.println("         Total number of cards left: " + d.getDeckTotal());
		System.out.println("\n");
	}
}
