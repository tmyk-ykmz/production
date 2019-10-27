package SampleProgram;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

class Button extends JFrame{
  public static void main(String args[]){
    Button frame = new Button("タイトル");
    frame.setVisible(true);
  }

  Button(String title){
    setTitle(title);
    setBounds(100, 100, 300, 250);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel p = new JPanel();

    JButton button1 = new JButton();
    JButton button2 = new JButton("確認");
    JButton button3 = new JButton();
    button3.setText("キャンセル");

    p.add(button1);
    p.add(button2);
    p.add(button3);

    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);
  }
}