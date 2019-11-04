
package SampleProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI extends JFrame {
    private static final long serialVersionUID = 1L;

    // ウィンドウ本体
    public GUI() {
        // ウィンドウの閉じ方
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 位置とサイズ
        setBounds(100, 100, 640, 480);

        // ボタン作成
        JButton btn1 = new JButton("ボタン1");
        add(btn1);  // ボタン追加

        // クリック時の処理
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("クリック");
            }
        });
    }

    public static void main(String[] args) {
        GUI frm = new GUI();   // ウィンドウ作成
        frm.setVisible(true);  // 表示
    }
}