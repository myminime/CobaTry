/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonny
 */
public class WinRegistryTest {
    public static void main(String args[]) throws Exception {
      String value = "";

      // IE Download directory (HKEY_CURRENT_USER)
      value = WinRegistry.readString(
          WinRegistry.HKEY_CURRENT_USER,
          "Software\\Microsoft\\Internet Explorer",
          "Download Directory");
      System.out.println("IE Download directory = " + value);

      // Query for Acrobat Reader installation path (HKEY_LOCAL_MACHINE)
      value = WinRegistry.readString(
          WinRegistry.HKEY_LOCAL_MACHINE,
          "SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\App Paths\\AcroRd32.exe",
          "");
      System.out.println("Acrobat Reader Path = " + value);
}
