package Registry;

import java.awt.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonny
 */
public class GetRegistry {
    
    public static void main(String[] args) {
 
        List<String> ls = WinRegistry.readStringSubKeys(WinRegistry.HKEY_LOCAL_MACHINE,"SOFTWARE\\Wow6432Node\\Microsoft\\Windows\\CurrentVersion\\Uninstall\\");
        String key = ls.stream().filter(st -> st.matches("Maxima.*")).findAny().get();
    }
}
