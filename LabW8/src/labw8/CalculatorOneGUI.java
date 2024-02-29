/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw8;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author kitti
 */
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel jp;
    private JTextField tf, optf, otf;
    private JButton plusbt, minusbt, multibt, divbt;
    public CalculatorOneGUI() {
        fr = new  JFrame("Test");
        plusbt = new JButton("plus");
        minusbt = new JButton("minus");
        multibt = new JButton("multi");
        divbt = new JButton("div");
        tf = new JTextField("input", 1);
        optf = new JTextField("operator", 1);
        otf = new JTextField("output", 1);
        jp = new JPanel();
        jp.setLayout(new GridLayout(1, 6));
        jp.add(new JPanel());
        jp.add(plusbt);
        jp.add(minusbt);
        jp.add(multibt);
        jp.add(divbt);
        jp.add(new JPanel());
        fr.setLayout(new GridLayout(4, 1));
        fr.add(tf);
        fr.add(optf);
        fr.add(jp);
        fr.add(otf);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
