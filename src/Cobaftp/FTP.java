/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cobaftp;

/**
 *
 * @author JustSonny
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class FTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File sourceFile = new File ("G:\\asal\\*.txt");
        File destinationFile = new File ("G:\\tujuan");
        try {
            Files.move(sourceFile.toPath(),destinationFile.toPath(),StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File move successfully");
            //JOptionPane.showMessageDialog(null,"File move successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
