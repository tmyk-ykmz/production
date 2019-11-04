package SampleProgram;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;

class Panel extends JFrame {
	public static void main(String args[]) {
		Panel frame = new Panel("タイトル");
		frame.setVisible(true);
	}

	Panel(String title) {
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(200, 100));
		p.setBackground(Color.ORANGE);

		JLabel label = new JLabel("入場者数");
		JTextField text = new JTextField(5);

		p.add(label);
		p.add(text);

		Container contentPane = getContentPane();
		contentPane.add(p);
	}
}