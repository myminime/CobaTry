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
 
        // Sample usage
        String value = WindowsRegistry.readRegistry("HKLM\\SOFTWARE\\Policies\\MyApplication\\AES", "SecurityKey");
        System.out.println(value);
}
