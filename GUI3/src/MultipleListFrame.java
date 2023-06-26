import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class MultipleListFrame extends JFrame implements ActionListener {

	private JList colorList, copyList;
	private String[] colorName = { "green", "yellow", "black", "blue", "orange" };
	private JButton btn;

	public MultipleListFrame() {
		super("MultipleList Practices");
		setLayout(new FlowLayout());                                          // bileşenleri soldan sağa yerleştiriyor

		colorList = new JList(colorName);
		add(colorList);
		colorList.setVisibleRowCount(3);                                       // gözüken satır sayısı
		add(new JScrollPane(colorList));                                       // kayan çubuk eklendi

		btn = new JButton("Copy>>");                                           // buton oluşturuldu
		btn.addActionListener(this);                                           // butonda olay var dedik
		add(btn);                                                              // buton eklendi

		copyList = new JList();
		copyList.setVisibleRowCount(3);
		copyList.setFixedCellHeight(15);
		copyList.setFixedCellWidth(100);
		add(new JScrollPane(copyList));

		setVisible(true);
		setSize(300, 150);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		new MultipleListFrame();
	}

	public void actionPerformed(ActionEvent e) {

		copyList.setListData(colorList.getSelectedValues()); // seçili olan değeri copyliste ayarla

	}

}
