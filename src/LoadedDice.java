
public class LoadedDice extends RegularDice{
	
	//constructor
	public LoadedDice() {
		super();
	}
	
	//generate odd number roll
	public int generateRoll() {
		int something = (int) (Math.random() * 100) + 1;
		if (something <= 80) {
			int allNumRoll = (int) (Math.random() * getNumSides()) + 1;
			int roll = allNumRoll * 2 - 1;
			return roll;
		} else {
			int allNumRoll = (int) (Math.random() * getNumSides()) + 1;
			int roll = allNumRoll * 2;		
			return roll;
		}
	}

	
}
