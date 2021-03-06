package second_exer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MnemonicEx extends JFrame {
    public MnemonicEx() {

        initUI();
    }

    private void initUI(){

        JButton btn = new JButton("Button");
        btn.addActionListener((ActionEvent e) -> {
            System.out.println("Button pressed");
        });

        btn.setMnemonic(KeyEvent.VK_UP);

        createLayout(btn);

        setTitle("Mnemonics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
        .addComponent(arg[0])
        .addGap(200)
        );


        gl.setVerticalGroup(gl.createSequentialGroup()
        .addComponent(arg[0])
        .addGap(200)
        );

        pack();

    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MnemonicEx ex = new MnemonicEx();
            ex.setVisible(true);
        });
	// write your code here
    }
}
