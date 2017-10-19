/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaReg;

//import Registry.RegQuery;
import java.io.*;

/**
 *
 * @author sonny
 */
public class ProgramFiles {
    
    private static final String REGQUERY_UTIL = "reg query ";
    private static final String REGSTR_TOKEN = "REG_SZ";
    private static final String REGDWORD_TOKEN = "REG_DWORD";
    
    /*
    private static final String PERSONAL_FOLDER_CMD = REGQUERY_UTIL +
    "\"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\"
     + "Explorer\\Shell Folders\" /v Personal";
    */

    private static final String PERSONAL_FOLDER_CMD = REGQUERY_UTIL +
    "\"HKLM\\Software\\Microsoft\\Windows\\CurrentVersion\\" + "/v ProgramFilesDir";
    
      public static String getCurrentUserPersonalFolderPath() {
    try {
      Process process = Runtime.getRuntime().exec(PERSONAL_FOLDER_CMD);
      RegQuery.StreamReader reader = new RegQuery.StreamReader(process.getInputStream());

      reader.start();
      process.waitFor();
      reader.join();

      String result = reader.getResult();
      int p = result.indexOf(REGSTR_TOKEN);

      if (p == -1)
         return null;

      return result.substring(p + REGSTR_TOKEN.length()).trim();
    }
    catch (IOException | InterruptedException e) {
      return null;
    }
  }
}

