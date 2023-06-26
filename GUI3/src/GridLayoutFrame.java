import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutFrame extends JFrame implements ActionListener {

	private JButton[] btn;
	private String[] name = { "one", "two", "three", "for", "five", "six" };
	private JPanel pnl1, pnl2;
	private JTextField txt1;

	public GridLayoutFrame() {

		setLayout(new BorderLayout());

		pnl1 = new JPanel();
		pnl2 = new JPanel();                                                        // paneller oluşturuldu

		txt1 = new JTextField(12);                                                  // text oluşturuldu
		pnl1.add(txt1);                                                             // text alanı panele eklendi

		pnl2.setLayout(new GridLayout(2, 3));
		btn = new JButton[name.length];                                             // buton dizisinin boyutu name in uzunluğu kadar olacak

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(name[i]);                                          // buton oluştu ve üzerine yazı yazıldı
			btn[i].addActionListener(this);

			pnl2.add(btn[i]);                                                      // panel 2 ye butonlar eklendi

		}

		add(pnl1, BorderLayout.NORTH);                                             // paneller frame eklendi
		add(pnl2, BorderLayout.CENTER);                                            // panellerin yerleri belirtildi

		setTitle("Gridlayout");
		setVisible(true);
		setSize(300, 150);
		setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		new GridLayoutFrame();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btn[0])
			txt1.setText(txt1.getText() + "1");
		if (e.getSource() == btn[1])
			txt1.setText(txt1.getText() + "2");
		if (e.getSource() == btn[2])
			txt1.setText(txt1.getText() + "3");
		if (e.getSource() == btn[3])
			txt1.setText(txt1.getText() + "4");
		if (e.getSource() == btn[4])
			txt1.setText(txt1.getText() + "5");
		if (e.getSource() == btn[5])
			txt1.setText(txt1.getText() + "6");
	}

}
