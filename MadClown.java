public class MadClown extends Enemy implements GameElement { 
	private boolean item;
	
	public MadClown(boolean weapon) {
		item = weapon;
	}
	boolean hasWeapon() {
		return item;
	}
	public void tick() {
		int life = getHealth() - 1;
		setHealth(life);
	}
}