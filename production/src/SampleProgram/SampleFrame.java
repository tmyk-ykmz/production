package SampleProgram;

import javax.swing.*;
// ウィンドウ表示サンプル

public class SampleFrame {
	public static void main(String args[]) {
		JFrame frame = new JFrame("test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}
