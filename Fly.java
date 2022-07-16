public class Fly implements Pest {
	private String flyAroundYourHead() {
		return "Fly around your head";
	}
	private String landOnThings() {
		return "Land on things";
	}
	public String annoy() {
		return flyAroundYourHead() + "\n" + landOnThings();
	}
}