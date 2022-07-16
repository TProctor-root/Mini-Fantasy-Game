public class Telemarketer extends Person implements Pest {
	public Telemarketer(String name) {
		super(name);
	}
	private String callDuringDinner() {
		return "Call during dinner";
	}
	private String continueTalkingWhenYouSayNo() {
		return "Continue talking when you say no";
	}
	public String annoy() {
		return callDuringDinner() + "\n" + continueTalkingWhenYouSayNo();
	}
}