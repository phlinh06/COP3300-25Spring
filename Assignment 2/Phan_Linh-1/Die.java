package assignment2;

import java.util.Random;

public class Die {
	
	private int faceValue;;
	//default constructor
	public Die() {
		this.faceValue = 1;
	}
	//get value 
	public int getFaceValue() {
		return faceValue;
	}
	//set value
	public void setFaceValue(int fv) {
		if (fv > 0 && fv <= 6)
		this.faceValue = fv;
	}
	//die roll
	public void roll() {
		Random rand = new Random();
		int randomNum = (int) rand.nextInt(6) + 1;
		setFaceValue(randomNum);
	}

}
