public class PotOfGold implements GameElement { 
	private int jar;
	
	public PotOfGold(int numPieces) {
		jar = numPieces;
	}
	public int getNumPieces() {
		return jar;
	}
	public void tick() {
		jar = jar + 1;
	}
}