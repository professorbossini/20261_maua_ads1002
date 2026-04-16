package br.maua.maua_ads1002_hello_swing;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class HelloSwing {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Hello, Swing!!");
        JLabel helloSwingLabel = new JLabel("Hello, Swing!!!!!");
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.add(helloSwingLabel);
        tela.pack();
        tela.setLocationRelativeTo(null); //centraliza
        tela.setVisible(true);
    }
}
