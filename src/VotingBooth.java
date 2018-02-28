import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int age2 = Integer.parseInt(age);
		if (age2 >= 18) {
			JOptionPane.showInputDialog("Who do you think the president should be?");
		} else {
			JOptionPane.showMessageDialog(null, "No one cares what you think!");
		}
	}

}
