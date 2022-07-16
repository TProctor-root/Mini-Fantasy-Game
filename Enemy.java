public abstract class Enemy { 
	private int a;
	
	public Enemy() {
		a = 100;
	}
	public int getHealth() {
		return a;
	}
	public void setHealth(int health) {
		if(health > 100) {
			a = 100;
		}
		else if(health < 0) {
			a = 0;
		}
		else {
			a = health;
		}
	}
}