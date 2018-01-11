import javax.swing.JOptionPane;

public class RegularDice {
	//attributes
	private int numSides;
	//methods
	//constructor
	
	public RegularDice() {
		setNumSides(numSides);
	}
	
	//setter
	public void setNumSides(int ns) {
		//account for various number of sides
		String inputNumSides = JOptionPane.showInputDialog("How many sides do you want on this dice?");
		ns = Integer.parseInt(inputNumSides);
		if (ns >= 4) {
			numSides = ns;
		} else {
			JOptionPane.showMessageDialog(null, "Number of sides cannot be less than 4. Default to 6.");
			numSides = 6;
		}
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public int generateRoll() {
		int roll = (int) (Math.random() * numSides) + 1;
		return roll;
	}
	
	public String toString() {
		return "\nNumber of Sides: " + numSides;
	}
}
