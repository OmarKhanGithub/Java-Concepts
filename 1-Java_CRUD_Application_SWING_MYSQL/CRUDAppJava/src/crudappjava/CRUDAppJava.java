/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudappjava;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author major
 */
public class CRUDAppJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        
        System.out.println("Available Look and Feels:");
        for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getName() + " -> " + look.getClassName());
        }
        
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf()); // Set FlatLaf Theme
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            crud app = new crud(); // Create an instance of the CRUD JFrame
            app.setVisible(true);  // Make the JFrame visible
        });
    }
    
}
