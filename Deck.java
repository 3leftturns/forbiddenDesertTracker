public class Deck {
	private int sunBeatsDown = 4;
	private int stormPicksUp = 3;
	private int stormMoves = 24;
	private int deckTotal = sunBeatsDown + stormPicksUp + stormMoves;

	public int getSunBeatsDown(){
		return sunBeatsDown;
	}
	
	public int getStormPicksUp(){
		return stormPicksUp;
	}
	
	public int getStormMoves(){
		return stormMoves;
	}
	
	public int getDeckTotal(){
		return sunBeatsDown + stormPicksUp + stormMoves;
	}
	
	public double calculateOddsSunBeatsDown(int sunBeatsDownLeft, int cardsLeft) {
		double result = ((double) sunBeatsDownLeft / (double) cardsLeft) * 100;
		return result;
	}

	public double calculateOddsStormPicksUp(int stormPicksUpLeft, int cardsLeft) {
		double result = ((double) stormPicksUpLeft / (double) cardsLeft) * 100;
		return result;
	}

	public void useSunBeatsDown() {
		this.sunBeatsDown--;
	}

	public void useStormPicksUp() {
		this.stormPicksUp--;
	}

	public void useStormMoves() {
		this.stormMoves--;
	}
}