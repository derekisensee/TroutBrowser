import javax.swing.*;
import java.awt.*;

class Driver {
    private JFrame mainFrame;
    private JLabel someText;

    public Driver() {
	prepGUI();
    }

    private void prepGUI() {
	mainFrame = new JFrame("TroutBrowser");
	mainFrame.setSize(500, 500);
	mainFrame.setLayout(new GridLayout(3, 1)); //i don't think i need this just yet.

	someText = new JLabel("", JLabel.CENTER);

	mainFrame.add(someText);
	
	mainFrame.setVisible(true);
    }

    private void show() {
	someText.setText("Hello Trout!");
    }

    public static void main(String[] args) {
	Driver d = new Driver();
	d.show();
    }
}
