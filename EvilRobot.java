public class EvilRobot extends Enemy implements Stompable, GameElement { 
	private double weight;
	
	public EvilRobot(double strength) {
		weight = strength;
	}
	double getStrength() {
		return weight;
	}
	public int stompOn() {
		double calc = weight / 100;
		double calc2 = calc * 10;
		weight = weight - calc2;
		return 0;
	}
	public void tick() {
		double calc = weight / 100;
		double calc2 = calc * 10;
		weight = weight + calc2;
	}
}