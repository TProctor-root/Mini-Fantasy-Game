public class Zombie extends Enemy implements Stompable, GameElement { 
	private double size;
	public Zombie(double height) {
		size = height;
	}
	public double getHeight() {
		return size;
	}
	public int stompOn() {
		size = size / 2;
		int life = getHealth() - 25;
		setHealth(life);
		return 0;	
	}
	public void tick() {
		double calc = size / 100;
		double calc2 = calc * 10;
		size = size + calc2;
		int life = getHealth() + 5;
		setHealth(life);	
	}
}