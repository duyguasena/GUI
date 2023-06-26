import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyFrame extends JFrame implements KeyListener {

	private JTextArea txt1;

	public KeyFrame() {
		super("KeyFrame");
		setLayout(new FlowLayout());

		txt1 = new JTextArea(12, 14);                                            // boyut verdik
		txt1.setEnabled(true);                                                   //false olırsa  erişim sağlanamıyor
		txt1.setDisabledTextColor(Color.green);
		txt1.addKeyListener(this);
		add(txt1);

		setVisible(true);
		setSize(300, 300);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new KeyFrame();
	}

	public void keyTyped(KeyEvent e) {
		// System.out.println("typed");

	}

	public void keyPressed(KeyEvent e) {
		// System.out.println("pressed");
		// System.out.println(e.getKeyChar() + "\t" + e.getKeyCode());            // hangi harfe basarsam onu döndürüyor

		System.out.println(txt1.getText() + e.getKeyChar());                      // her harf yan yana yazılır

		switch (e.getKeyCode()) {
		case 65:
			System.out.println("algoritma");
			break;
		case 66:
			System.out.println("bilgisayar");
			break;
		case 67:
			System.out.println("engineering");
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		// System.out.println("released");

	}
}
