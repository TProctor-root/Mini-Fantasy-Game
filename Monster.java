public class Monster extends Enemy implements Stompable, GameElement { 
	private String color;
	
	public Monster() {
		color = "green";
	}
	public String getColor() {
		return color;
	}
	public int stompOn() {
		color = "red";
		int life = getHealth() - 100;
		setHealth(life);
		return 100;
	}
	public void tick() {
		int life = getHealth() - 10;
		setHealth(life);
		if(color == "green") {
			color = "yellow";
		}
		else if(color == "yellow") {
			color = "blue";
		}
		else if(color == "blue" || color == "red") {
			color = "green";
		}
					
	}
}