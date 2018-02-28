import javax.swing.JOptionPane;

public class Rollercoaster {
	public static void main(String[] args) {
		String height = JOptionPane.showInputDialog("How tall are you? (in inches)");
		int height2 = Integer.parseInt(height);
		if (height2 >= 48) {
			JOptionPane.showMessageDialog(null, "You can ride a rollercoaster!");
		} else {
			JOptionPane.showMessageDialog(null, "You still need to grow more :(");
		}
	}

}
