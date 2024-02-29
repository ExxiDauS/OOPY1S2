/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw8;
import java.awt.GridLayout;
import  javax.swing.*;
/**
 *
 * @author kitti
 */
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel jp;
    private JTextField tf;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btequal, btc, btp, btm, btmulti, btdiv;

    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        jp = new JPanel();
        bt0 = new JButton("0");
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        btequal = new JButton("=");
        btc = new JButton("c");
        btp = new JButton("+");
        btm = new JButton("-");
        btmulti = new JButton("x");
        btdiv = new JButton("/");
        tf = new JTextField();
        jp.setLayout(new GridLayout(4, 4));
        jp.add(bt7);
        jp.add(bt8);
        jp.add(bt9);
        jp.add(btp);
        jp.add(bt4);
        jp.add(bt5);
        jp.add(bt6);
        jp.add(btm);
        jp.add(bt1);
        jp.add(bt2);
        jp.add(bt3);
        jp.add(btmulti);
        jp.add(bt0);
        jp.add(btc);
        jp.add(btequal);
        jp.add(btdiv);
        fr.setLayout(new GridLayout(2, 1));
        fr.add(tf);
        fr.add(jp);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
