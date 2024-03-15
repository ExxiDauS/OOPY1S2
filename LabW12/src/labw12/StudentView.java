/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw12;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author kitti
 */
public class StudentView implements ActionListener, WindowListener{
    private JFrame jf;
    private JPanel btnPanel, combinePanel;
    private JButton deposit, withdraw;
    private JTextField idField, nameField, moneyField;
    private JLabel idLabel, nameLabel, moneyLabel;
    private Student studentTmp = new Student();
    private File f = new File("StudentM.dat");
    
    public StudentView(){
        jf = new JFrame();
        btnPanel = new JPanel(new FlowLayout());
        combinePanel = new JPanel(new GridLayout(3, 3));
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        idField = new JTextField();
        nameField = new JTextField();
        moneyField = new JTextField();
        idLabel = new JLabel("ID:       ");
        nameLabel = new JLabel("Name:       ");
        moneyLabel = new JLabel("Money:       ");
        moneyField.setEditable(false);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        jf.addWindowListener(this);
        combinePanel.add(idLabel);
        combinePanel.add(idField);
        combinePanel.add(nameLabel);
        combinePanel.add(nameField);
        combinePanel.add(moneyLabel);
        combinePanel.add(moneyField);
        btnPanel.add(deposit);
        btnPanel.add(withdraw);
        jf.setLayout(new GridLayout(2, 1));
        jf.add(combinePanel);
        jf.add(btnPanel);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        new StudentView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = e.getActionCommand();
        Double mTmp;
        try {
            mTmp = Double.valueOf(moneyField.getText());
            
        } catch (Exception er) {
            mTmp = 0d;
        }
        switch (tmp) {
            case "Deposit":
                mTmp += 100;
                moneyField.setText(mTmp.toString());
                break;
            case "Withdraw":
                mTmp -= 100;
                moneyField.setText(mTmp.toString());
                break;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        Student s = new Student();
        int nTmp;
        Double dTmp;
        if (f.exists()){
            try( FileInputStream fIn = new FileInputStream(f);
                 ObjectInputStream oIn = new ObjectInputStream(fIn);
                )
            {
                s = (Student) oIn.readObject();
                System.out.println(s.getID());
                nTmp = s.getID();
                dTmp = s.getMoney();
                idField.setText(Integer.toString(nTmp));
                nameField.setText(s.getName());
                moneyField.setText(Double.toString(dTmp));
            } 
            catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException er){
                er.printStackTrace();
            }
        }
        else{
            nTmp = s.getID();
            dTmp = s.getMoney();
            idField.setText(Integer.toString(nTmp));
            nameField.setText("");
            moneyField.setText(Double.toString(dTmp));
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Student s = new Student(nameField.getText(), Integer.parseInt(idField.getText()), Double.valueOf(moneyField.getText()));
        try (FileOutputStream fOut = new FileOutputStream(f);
             ObjectOutputStream oOut = new ObjectOutputStream(fOut);)
        {
//            System.out.println(s.getID() + "\n" + s.getName() + "\n" + s.getMoney());
            oOut.writeObject(s);
        } catch (IOException er) {
            er.printStackTrace();
        }  
    }

    @Override
    public void windowClosed(WindowEvent e) {  
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
