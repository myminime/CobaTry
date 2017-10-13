/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cobaftp;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author sonny
 */
public class PindahAll {
    
    public static void  main (String[] args) throws IOException {
        
        File dir = new File("D/asal/");
        
        File[] list = dir.listFiles();
        
        for(File file : list) {
            if(file.isDirectory()){
                System.out.println("Directory: "+file.getName());
            }
            else {
                System.out.println("File "+file.getName());
            }
        }
    }
}
