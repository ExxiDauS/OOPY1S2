package prefinal_open;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class BookView implements ActionListener, WindowListener{
    private JFrame jf, updateJf;
    private JPanel combPanel, lstPanel, btnPanel;
    private JTextField lstField, nameField, priceField;
    private JComboBox typeComboBox;
    private JLabel nameLabel, priceLabel, typeLabel;
    private JButton leftBtn, rightBtn, addBtn, updateBtn, delBtn, okBtn;
    private ArrayList<Book> bookLst = new ArrayList<Book>();
    
    public BookView(){
        jf = new JFrame();
        updateJf = new JFrame();
        combPanel = new JPanel(new GridLayout(3, 2));
        lstPanel = new JPanel(new FlowLayout());
        btnPanel = new JPanel(new FlowLayout());
        nameField = new JTextField(10);
        priceField = new JTextField(10);
        lstField = new JTextField(5);
        typeComboBox = new JComboBox();
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");
        leftBtn = new JButton("<<<");
        rightBtn = new JButton(">>>");
        addBtn = new JButton("Add");
        updateBtn = new JButton("Update");
        delBtn = new JButton("Delete");
        okBtn = new JButton("OK");
        
        typeComboBox.addItem("General");
        typeComboBox.addItem("Math&Sci");
        typeComboBox.addItem("Computer");
        typeComboBox.addItem("Photo");
        
        addBtn.addActionListener(this);
        updateBtn.addActionListener(this);
        leftBtn.addActionListener(this);
        rightBtn.addActionListener(this);
        delBtn.addActionListener(this);
        
        combPanel.add(nameLabel);
        combPanel.add(nameField);
        combPanel.add(priceLabel);
        combPanel.add(priceField);
        combPanel.add(typeLabel);
        combPanel.add(typeComboBox);
        
        lstPanel.add(leftBtn);
        lstPanel.add(lstField);
        lstPanel.add(rightBtn);
        
        btnPanel.add(addBtn);
        btnPanel.add(updateBtn);
        btnPanel.add(delBtn);
        
        jf.addWindowListener(this);
        
        jf.setLayout(new BorderLayout());
        jf.add(combPanel, BorderLayout.NORTH);
        jf.add(lstPanel, BorderLayout.CENTER);
        jf.add(btnPanel, BorderLayout.SOUTH);
        
        updateJf.setLayout(new BorderLayout());
        updateJf.add(okBtn);
        
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BookView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmp = e.getActionCommand();
        Book bTmp;
        switch (tmp) {
            case "Add":
                new BookAdd(this);
                break;
            case "Update":
                Book b = (Book) bookLst.get(Integer.parseInt(lstField.getText()));
                b.setName(nameField.getText());
                b.setPrice(Double.parseDouble(priceField.getText()));
                b.setType(typeComboBox.getSelectedItem() + "");
                JOptionPane.showMessageDialog(updateJf, "Done it.");
                System.out.println(bookLst.size());
            case "<<<":
                int tmpI = Integer.parseInt(lstField.getText());
                if (("0".equals(lstField.getText()))) {
                    break;
                }
                else{
                    nameField.setText(bookLst.get(tmpI - 1).getName());
                    priceField.setText(bookLst.get(tmpI - 1).getPrice() + "");
                    typeComboBox.setSelectedItem(bookLst.get(tmpI - 1).getType());
                    lstField.setText((tmpI - 1) + "");
                }
                break;
                
            case ">>>":
                int tmpI1 = Integer.parseInt(lstField.getText());
                if (((tmpI1 + 2) > (bookLst.size()))) {
                    break;
                }
                else{
                    nameField.setText(bookLst.get(tmpI1 + 1).getName());
                    priceField.setText(bookLst.get(tmpI1 + 1).getPrice() + "");
                    typeComboBox.setSelectedItem(bookLst.get(tmpI1 + 1).getType());
                    lstField.setText((tmpI1 + 1) + "");
                }
                break;
                
            case "Delete":
                int tmp2 = Integer.parseInt(lstField.getText());
                bookLst.remove(tmp2);
                if (!bookLst.isEmpty()) {
                    nameField.setText(bookLst.get(tmp2 - 1).getName());
                    priceField.setText(bookLst.get(tmp2 - 1).getPrice() + "");
                    typeComboBox.setSelectedItem(bookLst.get(tmp2 - 1).getType());
                    lstField.setText((tmp2 - 1) + "");
                }
                else{
                    nameField.setText(null);
                    priceField.setText("0.0");
                    lstField.setText("0");
                }
                JOptionPane.showMessageDialog(updateJf, "Done it.");
                
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        File f = new File("Book.data");
        if (f.exists()) {
            try (FileInputStream fIn = new FileInputStream(f);
                ObjectInputStream oIn = new ObjectInputStream(fIn)){
                setBookLst((ArrayList<Book>) oIn.readObject());
                nameField.setText(bookLst.get(0).getName());
                priceField.setText(Double.toString(bookLst.get(0).getPrice()));
                typeComboBox.setSelectedItem(bookLst.get(0).getType());
                lstField.setText("0");
            } catch (IOException err) {
                err.printStackTrace();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        else{
            nameField.setText(null);
            priceField.setText("0.0");
            lstField.setText("0");
       }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fOut = new FileOutputStream("Book.data");
            ObjectOutputStream oOut = new ObjectOutputStream(fOut)){
            oOut.writeObject(bookLst);
        } catch (IOException err) {
            err.printStackTrace();
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
    
    public ArrayList getBookLst(){
        return bookLst;
    }
    
    public void setBookLst(ArrayList<Book> bookLst){
        this.bookLst = bookLst;
    }
}
