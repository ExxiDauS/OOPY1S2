/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw9;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  javax.swing.*;
/**
 *
 * @author kitti
 */
public class CalculatorSample implements ActionListener{
//    Components
    private JFrame fr;
    private JPanel jp;
    private JTextField tf;
    private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btequal, btc, btp, btm, btmulti, btdiv;
    private double temp = 0d;
    private double result = 0d;
    private int operator = 0;
    
    public CalculatorSample() {
//        Construct Components
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
        tf.setEditable(false);
//        Layout
        jp.setLayout(new GridLayout(4, 4));
//        col 1 7, 8, 9, +
        jp.add(bt7);
        jp.add(bt8);
        jp.add(bt9);
        jp.add(btp);
//        col 2 4, 5, 6, -
        jp.add(bt4);
        jp.add(bt5);
        jp.add(bt6);
        jp.add(btm);
//        col 3 1, 2, 3, *
        jp.add(bt1);
        jp.add(bt2);
        jp.add(bt3);
        jp.add(btmulti);
//        col 4 0, c, =, /
        jp.add(bt0);
        jp.add(btc);
        jp.add(btequal);
        jp.add(btdiv);
        fr.setLayout(new GridLayout(2, 1));
//        output
        fr.add(tf);
//        all button
        fr.add(jp);

//      Manage Handler        
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        btc.addActionListener(this);
        btp.addActionListener(this);
        btm.addActionListener(this);
        btmulti.addActionListener(this);
        btdiv.addActionListener(this);
        btequal.addActionListener(this);
        fr.setSize(500, 500);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    
//    Setup Handler
    @Override
    public void actionPerformed(ActionEvent e) {
        String operation = e.getActionCommand();
        switch (operation) {
            case "+" -> {
                temp = Double.parseDouble(tf.getText());
                operator = 1;
                tf.setText("");
                break;
            }
            case "-" -> {
                temp = Double.parseDouble(tf.getText());
                operator = 2;
                tf.setText("");
                break;
            }
            case "x" -> {
                temp = Double.parseDouble(tf.getText());
                operator = 3;
                tf.setText("");
                break;
            }
            case "/" -> {
                temp = Double.parseDouble(tf.getText());
                operator = 4;
                tf.setText("");
                break;
            }
            case "c" -> {
                temp = 0;
                tf.setText("");
                break;
            }
            case "=" -> {
                switch (operator) {
                    case 1 -> {
                        result = temp + Double.parseDouble(tf.getText());
                        tf.setText(Double.toString(result));
                        break;
                    }
                    case 2 -> {
                        result = temp - Double.parseDouble(tf.getText());
                        tf.setText(Double.toString(result));
                        break;
                    }
                    case 3 -> {
                        result = temp * Double.parseDouble(tf.getText());
                        tf.setText(Double.toString(result));
                        break;
                    }
                    case 4 -> {
                        try {
                            result = temp / Double.parseDouble(tf.getText());
                            tf.setText(Double.toString(result));
                            break;
                        } catch (Exception er) {
                            tf.setText("0");
                            break;
                        }
                    }
                }
            }
            default -> tf.setText(tf.getText() + e.getActionCommand());
        }
        System.out.println("temp : " + temp);
    }

    //    Setup program
    public static void main(String[] args) {
        new CalculatorSample();
    }

}
