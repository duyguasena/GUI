import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BorderLayoutFrame extends JFrame implements ActionListener {

	private JButton[] butons;                                                                                    //buton listesi tanımlandı
	private String[] names = { "NORTH", "SOUTH", "CENTER", "EAST", "WEST" };                                //buton üstündeki isimler tanımlandı
	Icon[] iconobj = { new ImageIcon(getClass().getResource("icon.png")),
			new ImageIcon(getClass().getResource("ayar.png")), new ImageIcon(getClass().getResource("face.png")),   //resimler tanımlandı
			new ImageIcon(getClass().getResource("ok.png")), new ImageIcon(getClass().getResource("icon.png")) };

	
	
	public BorderLayoutFrame() {

		setLayout(new BorderLayout());

		butons = new JButton[names.length];          //names elemanı kadar buton tut

		Random r = new Random();

		for (int i = 0; i < butons.length; i++) {
			butons[i] = new JButton(names[i]);
			butons[i].addActionListener(this);
			butons[i].setIcon(iconobj[r.nextInt(5)]);
			int num = 1 + r.nextInt(5);      //rastgele sayı üret
			butons[i].setText("" + num + "!=" + getFact(num));
		}

		add(butons[0], BorderLayout.NORTH);
		add(butons[1], BorderLayout.SOUTH);
		add(butons[2], BorderLayout.CENTER);
		add(butons[3], BorderLayout.EAST);
		add(butons[4], BorderLayout.WEST);

		setTitle("borderlayout");
		setVisible(true);
		setSize(900, 700);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new BorderLayoutFrame();
	}

	public void actionPerformed(ActionEvent e) {
		// JOptionPane.showMessageDialog(null,"Clicked");

		if (e.getSource() == butons[0]) {
			JOptionPane.showMessageDialog(null, "Clicked");
			new MouseTrackerFrame();                          // başka frame e geçiş yaptık
		}
	}

	public int getFact(int num) {
		int result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
