/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw9;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author kitti
 */
public class TellerGUI implements ActionListener{
    private JFrame fr;
    private JPanel top, bottom;
    private JLabel label1, label2;
    private JTextField balance, amount;
    private JButton deposit, withdraw, exit;
    private double moneybalance = 6000;

    public TellerGUI() {
//        construct components
        fr = new JFrame("Teller GUI");
        top = new JPanel();
        top.setLayout(new GridLayout(2, 2));
        bottom = new JPanel();
        bottom.setLayout(new FlowLayout());
        label1 = new JLabel("Balance");
        label2 = new JLabel("Amount");
        balance = new JTextField(Double.toString(moneybalance), 1);
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
//        set layout
        fr.setLayout(new GridLayout(2, 1));
        fr.add(top);
        fr.add(bottom);
//        setup handler
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        exit.addActionListener(this);
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
   
//    Configure Handler

    @Override
    public void actionPerformed(ActionEvent e) {
        double temp = 0;
        try {
            temp = Double.parseDouble(amount.getText());
        } catch (Exception er) {
            temp += 0;
        }
        String operation = e.getActionCommand();
        System.out.println(operation);
        switch (operation) {
            case "Deposit" -> {
                try {
                    moneybalance += temp;
                    balance.setText(Double.toString(moneybalance));
                    amount.setText("");
                    break;
                } catch (Exception er) {
                    break;
                }
            }
            
            case "Withdraw" -> {
                if ((moneybalance - temp) < 0){
                    break;
                }
                else {
                    try {
                        moneybalance -= temp;
                        balance.setText(Double.toString(moneybalance));
                        amount.setText("");
                        break;
                    } catch (Exception er) {
                        break;
                    }
                }
            }
            case "Exit" -> {
                System.exit(0);
            }
            default -> {
                break;
            }
        }
    }
        
    public static void main(String[] args) {
        new TellerGUI();
    }

}
