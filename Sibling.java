public class Sibling extends Person implements Pest {	
	public Sibling(String name) {
		super(name);
	}
	private String teaseYouAboutYourInsecurities() {
		return "Tease you about your insecurities";
	}
	private String laughAtYouWhenYouAreMad() {
		return "Laugh at you when you are mad";
	}
	public String annoy() {
		return teaseYouAboutYourInsecurities() + "\n" + laughAtYouWhenYouAreMad();
	}
}