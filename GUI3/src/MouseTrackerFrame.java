import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MouseTrackerFrame extends JFrame implements MouseListener, MouseMotionListener {

	private JPanel mousePanel;
	private JLabel statusbar;

	public MouseTrackerFrame() {
		setTitle("MouseTracker Practices");
		setLayout(new BorderLayout());

		mousePanel = new JPanel();
		mousePanel.setBackground(Color.pink);
		mousePanel.addMouseListener(this);
		mousePanel.addMouseMotionListener(this);
		add(mousePanel, BorderLayout.CENTER);                                     // bileşenin yerini belirtebiliyorum

		statusbar = new JLabel("My Label", SwingConstants.CENTER);               // yazıyı merkeze aldık
		add(statusbar, BorderLayout.NORTH);                                      // labeli kuzeye yerleştirdik

		setVisible(true);
		setLocationRelativeTo(null);
		setSize(300, 300);
	}

	public static void main(String[] args) {
		new MouseTrackerFrame();

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("cliked");

		// statusbar.setText(String.format("coordinat:[%d,%d]",e.getX(),e.getY()));
		// //labelin koordinatlarını aldık

	}

	public void mousePressed(MouseEvent e) {
		System.out.println("pressed");

	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("reeased");

	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("entered");

	}

	public void mouseExited(MouseEvent e) {
		System.out.println("exited");

	}

	public void mouseDragged(MouseEvent e) {
		System.out.println("draggedd");

	}

	public void mouseMoved(MouseEvent e) {

		Random r = new Random();                                               // random sınıfından nesne oluşturduk
		Color[] colortitle = { Color.blue, Color.green, Color.red ,Color.pink};           // 3 renkli liste oluşturduk

		mousePanel.setBackground(colortitle[r.nextInt(4)]);                    // panelin arka rengini rastgele değiştirdik

		System.out.println("moved");

	}
}
