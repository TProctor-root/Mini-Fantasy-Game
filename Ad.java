public class Ad implements Pest {
	private String blockSomethingYouReallyWantToSee() { 
		return "Block something you really want to see";
	}
	private String dontGoAwayEvenWhenYouClickX() {
		return "Don't go away even when you click X";
	}
	public String annoy() {
		return blockSomethingYouReallyWantToSee() + "\n" + dontGoAwayEvenWhenYouClickX();
	}
}