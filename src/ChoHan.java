import javax.swing.JOptionPane;

public class ChoHan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1Points = 0;
		int p2Points = 0;
		
		int roll1 = 0;
		int roll2 = 0;
		
		String name1 = JOptionPane.showInputDialog("Player 1, what is your name?");
		String name2 = JOptionPane.showInputDialog("Player 2, what is your name?");
		
		for (int i = 0; i < 5; i++) {
			JOptionPane.showMessageDialog(null, "This is round " + (i+1) + " of a Cho Han Game.");
			//first dice
			int loadedOrNot = (int) (Math.random() * 2) + 1;
			if (loadedOrNot == 1) {
				//regular dice
				RegularDice regD = new RegularDice();
				roll1 = regD.generateRoll();
			} else {
				//loaded dice
				LoadedDice loadD = new LoadedDice();
				roll1 = loadD.generateRoll();
			}
			//second dice
			
			int loadedOrNot2 = (int) (Math.random() * 2) + 1;
			if (loadedOrNot2 == 1) {
				//regular dice
				RegularDice regD2 = new RegularDice();
				roll2 = regD2.generateRoll();
			} else {
				//loaded dice
				LoadedDice loadD2 = new LoadedDice();
				roll2 = loadD2.generateRoll();
			}
			
			String ChoOrHan;
			if ((roll1 + roll2) % 2 == 0) {//even (Cho)
				ChoOrHan = "Cho";
			} else {//odd (Han)
				ChoOrHan = "Han";
			}
			
			String player1 = JOptionPane.showInputDialog(name1 + ", what is your guess? Cho or Han?");
			String player2 = JOptionPane.showInputDialog(name2 + ", what is your guess? Cho or Han?");
			
			if (player1.equals(ChoOrHan)) {
				p1Points++;
				JOptionPane.showMessageDialog(null, name1 + " is correct! " + name1 + " has a total of " + p1Points + " point/s!");
			} else {
				JOptionPane.showMessageDialog(null, name1 + " is incorrect. "+ name1 + " still has a total of " + p1Points + " point/s.");
			}
			if (player2.equals(ChoOrHan)) {
				p2Points++;
				JOptionPane.showMessageDialog(null, name2 + " is correct. " + name2 + " has a total of " + p2Points + " point/s!");
			} else {
				JOptionPane.showMessageDialog(null, name2 + " is incorrect. " + name2 + " still has a total of " + p2Points + " point/s.");
			}
			
		}

	}

}
