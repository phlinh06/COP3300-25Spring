package assignment2;

public class Dice {
	//instances
	private Die die1; 
	private Die die2;
	//constructors
	public Dice() {
		this.die1 = new Die();
		this.die2 = new Die();
		this.die1.setFaceValue(1);
		this.die2.setFaceValue(1);
	}
	//get value 
	public int getFaceValueSum() {
		int sum = die1.getFaceValue() + die2.getFaceValue();
		return sum;
	}
	//dice rolls
	public void rollDice() {
		die1.roll();
		die2.roll();
	}
}
