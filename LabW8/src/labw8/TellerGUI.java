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
public class TellerGUI {
    private JFrame fr;
    private JPanel top, bottom;
    private JLabel label1, label2;
    private JTextField balance, amount;
    private JButton deposit, withdraw, exit;

    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        top = new JPanel();
        top.setLayout(new GridLayout(2, 2));
        bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        balance = new JTextField("6000", 1);
        balance.setEditable(false);
        amount = new JTextField(1);
        top.add(label1);
        top.add(balance);
        top.add(label2);
        top.add(amount);
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        bottom.add(deposit);
        bottom.add(withdraw);
        bottom.add(exit);
        fr.setLayout(new GridLayout(2, 1));
        fr.add(top);
        fr.add(bottom);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
    public static void main(String[] args) {
        new TellerGUI();
    }
}
