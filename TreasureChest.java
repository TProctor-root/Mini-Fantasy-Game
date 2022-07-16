public class TreasureChest implements GameElement { 
	private double lift;
	
	TreasureChest(double weight) {
		lift = weight;
	}
	double getWeight() {
		return lift;
	}
	public void tick() {
		double calc = lift / 100;
		double calc2 = calc * 5;
		lift = lift - calc2;
	}
}