public class Dragon extends Enemy implements Stompable, GameElement { 
	private boolean a;
	
	public Dragon(boolean fireBreathing) {
		a = fireBreathing;
	}
	public boolean isFireBreathing( ) {
		return a;
	}
	public int stompOn() {
		if(a == true) {
			a = false;
		}
		else {
			a = true;
		}
		int life = getHealth() + 50;
		setHealth(life);
		return -50;
	}
	public void tick() {
		int life = getHealth() - 20;
		setHealth(life);
	}
}