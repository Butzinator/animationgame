import javax.swing.*;
public class SimpleSizedPanel extends SizedPanel {
	public void paintComponent(java.awt.Graphics g) {
		g.fillOval(100, 100, 200, 200);
		g.fillRect(170,60,150,75);	
	}
	public static void main(String[] args) {
		ShowInFrame.show(new SimpleSizedPanel());
	}
}
