/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labw8;
import javax.swing.*;
/**
 *
 * @author kitti
 */
public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane desktopPane;
    private JMenuBar menu;
    private JMenu File, Edit, View, New;
    private JMenuItem Open, Save, Exit, Window, Message;
    private JInternalFrame app1, app2, app3;

    public MDIFromGUI() {
        fr = new JFrame("MDIFromGUI");
        desktopPane = new JDesktopPane();
        menu = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        View = new JMenu("View");
        menu.add(File);
        menu.add(Edit);
        menu.add(View);
        fr.setJMenuBar(menu);
        New = new JMenu("New");
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Exit = new JMenuItem("Exit");
        File.add(New);
        File.addSeparator();
        File.add(Open);
        File.addSeparator();
        File.add(Save);
        File.addSeparator();
        File.add(Exit);
        Window = new JMenuItem("Window");
        Message = new JMenuItem("Message");
        New.add(Window);
        New.addSeparator();
        New.add(Message);
        app1 = new JInternalFrame("Application 01", true, true, true, true);
        app2 = new JInternalFrame("Application 02", true, true, true, true);
        app3 = new JInternalFrame("Application 03", true, true, true, true);
        app1.setSize(250, 250);
        app1.setVisible(true);
        app2.setSize(500, 300);
        app2.setVisible(true);
        app3.setSize(400, 400);
        app3.setVisible(true);
        desktopPane.add(app1);
        desktopPane.add(app2);
        desktopPane.add(app3);
        fr.add(desktopPane);
        fr.setSize(1000, 1000);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
        
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {MDIFromGUI frame = new MDIFromGUI();});
        
    }
}
