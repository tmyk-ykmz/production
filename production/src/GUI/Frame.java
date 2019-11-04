package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {
	private static final long serialVersionUID = 1L;

	// ウィンドウ本体
	public Frame() {
		// ウィンドウの閉じ方
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 位置とサイズ
		setBounds(100, 100, 300, 300);

		// パネル作成
		JPanel p = new JPanel();
		p.setPreferredSize(new Dimension(300, 100));
		JPanel p2 = new JPanel();
		p2.setPreferredSize(new Dimension(300, 100));
		p2.setBackground(Color.orange);

		Container contentPane = getContentPane();
		contentPane.add(p);
		contentPane.add(p2);
		contentPane.add(p, BorderLayout.SOUTH);
		contentPane.add(p2, FlowLayout.CENTER);
		p.setLayout(new FlowLayout());

//		JTextField text new JTextField();
		JTextField text1;
		text1 = new JTextField("入力欄", 5);
		p2.add(text1);
//		contentPane.add(btn2, BorderLayout.SOUTH);
//		contentPane.add(btn2, FlowLayout.CENTER);

		// ボタン作成
		JButton btn1 = new JButton("算出方法");
		JButton btn2 = new JButton("計　　算");
		btn1.setPreferredSize(new Dimension(90, 30));
		btn2.setPreferredSize(new Dimension(300, 50));
		p.add(btn2); // ボタン追加
		p.add(btn1);
//				add(btn1);

		// クリック時の処理
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("算出方法");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("計算");
			}

		});
	}

	public static void main(String[] args) {

		Frame frm = new Frame(); // ウィンドウ作成
		frm.setVisible(true); // 表示
	}
}