package labw12;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.io.*;
public class ChatDemo implements ActionListener, WindowListener{
    private JFrame jf;
    private JPanel btnPanel, bottomPanel;
    private JTextArea chat;
    private JTextField input;
    private JButton submit, reset;
    private File chatLog = new File("ChatDemo.dat");

            
    public ChatDemo(){
        jf = new JFrame();
        btnPanel = new JPanel(new FlowLayout());
        bottomPanel = new JPanel(new GridLayout(2, 1));
        chat = new JTextArea(20, 45);
        input = new JTextField(45);
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        chat.setEditable(false);
        btnPanel.add(submit);
        btnPanel.add(reset);
        bottomPanel.add(input);
        bottomPanel.add(btnPanel);
        submit.addActionListener(this);
        reset.addActionListener(this);
        jf.addWindowListener(this);
        jf.setLayout(new BorderLayout());
        jf.add(chat, BorderLayout.NORTH);
        jf.add(bottomPanel, BorderLayout.CENTER);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = e.getActionCommand();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String inputTxt = dtf.format(LocalDateTime.now()) + " : " + input.getText();
        switch (tmp) {
            case "Submit":
                chat.append(inputTxt + "\n");
                input.setText(null);
                break;
            case "Reset":
                chat.setText(null);
                break;
        }
    }
    
    @Override
    public void windowClosing(WindowEvent ev){
        String tmp = chat.getText();
        try(FileWriter fw = new FileWriter(chatLog);){
            for (int i = 0; i < tmp.length(); i++){
                fw.write(tmp.charAt(i));
            }
        } catch (IOException err){
            err.printStackTrace();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        int ch;
        String tmp = "";
        
        if (chatLog.exists()) {
            try (FileReader fr = new FileReader(chatLog)){
                while ((ch = fr.read())!= -1) {                    
                    tmp = tmp + ((char)ch);
                    if (tmp.endsWith("\n")){
                        chat.append(tmp);
                        tmp = "";
                    }
                }
            } catch (IOException er) {
                er.printStackTrace();
            }
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
