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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWrite {
    
    public static void main(String[] args) throws IOException {
        
        File newFile = new File("G:/move.bat");
        FileWriter wFile = new FileWriter(newFile);
        
        try (BufferedWriter bw = new BufferedWriter(wFile)) {
            bw.write("test apa aja");
            bw.write("1000");
        }
        System.out.println("file written");
        
        if (newFile.exists()) {
            newFile.createNewFile();
            //System.out.println("File Exists");
        }
        try {
            newFile.createNewFile();
            }
        catch (Exception e){
            e.printStackTrace();
            }
            /*try{
            FileWriter wFile = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(wFile);
            bw.write("test apa aja");
            bw.write("apa aja");
            bw.close();
            System.out.println("file written");
            }*/
            
        
        
        /*try {
            
            File move = new File
        } catch (Ioexception e) {
            e.printStackTrace()
        }*/
    }
    
}
