package prefinal_open;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class BookAdd implements ActionListener{
    private JFrame jf;
    private JPanel combPanel;
    private JTextField lstField, nameField, priceField;
    private JComboBox typeComboBox;
    private JLabel nameLabel, priceLabel, typeLabel;
    private JButton insBtn;
    private BookView tmp;
    
    public BookAdd(BookView bookView){
        tmp = bookView;
        jf = new JFrame();
        combPanel = new JPanel(new GridLayout(3, 2));
        nameField = new JTextField(10);
        priceField = new JTextField(10);
        lstField = new JTextField(5);
        typeComboBox = new JComboBox();
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("Price");
        typeLabel = new JLabel("Type");
        insBtn = new JButton("Insert");
        
        insBtn.addActionListener(this);
        
        typeComboBox.addItem("General");
        typeComboBox.addItem("Math&Sci");
        typeComboBox.addItem("Computer");
        typeComboBox.addItem("Photo");
        
        combPanel.add(nameLabel);
        combPanel.add(nameField);
        combPanel.add(priceLabel);
        combPanel.add(priceField);
        combPanel.add(typeLabel);
        combPanel.add(typeComboBox);
        
        jf.setLayout(new BorderLayout());
        jf.add(combPanel, BorderLayout.NORTH);
        jf.add(insBtn, BorderLayout.CENTER);
        
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tmpTxt = e.getActionCommand();
        switch (tmpTxt) {
            case "Insert":
                this.tmp.getBookLst().add(new Book(nameField.getText(), Double.parseDouble(priceField.getText()), (typeComboBox.getSelectedItem() + "")));
                jf.dispose();
                break;
        }
    }
}
