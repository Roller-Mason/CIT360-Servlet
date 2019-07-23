/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.Dimension;
 
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
 

/**
 *
 * @author Mason
 */
public class View {
    
    public View() {
        // Create swing UI components 
        JLabel userHobbies = new JLabel();
        JTable table = new JTable();
 
        // Create new controller
        Controller controller = new Controller();
 
        // Set the view layout and get user hobbies from the controller
        JPanel ctrlPane = new JPanel();
        ctrlPane.add(userHobbies);
        userHobbies.setText(controller.getUserHobbies());
 
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(700, 182));
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "MVC Swing",
                TitledBorder.CENTER, TitledBorder.TOP));
 
        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, tableScrollPane);
        splitPane.setDividerLocation(35);
        splitPane.setEnabled(false);
 
        // Display it all in a scrolling window and make the window appear
        JFrame frame = new JFrame("Swing MVC App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
