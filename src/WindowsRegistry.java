
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonny
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
 
public class WindowsRegistry {
 
    /**
     * 
     * @param location path in the registry
     * @param key registry key
     * @return registry value or null if not found
     */
    public static final String readRegistry(String location, String key){
        try {
            // Run reg query, then read output with StreamReader (internal class)
            Process process = Runtime.getRuntime().exec("reg query " + 
                    '"'+ location + "\" /v " + key);
 
            StreamReader reader = new StreamReader(process.getInputStream());
            reader.start();
            process.waitFor();
            reader.join();
 
            // Parse out the value
            String[] parsed = reader.getResult().split("\\s+");
            if (parsed.length > 1) {
                return parsed[parsed.length-1];
            }
        } catch (IOException | InterruptedException e) {}
 
        return null;
    }
 
    static class StreamReader extends Thread {
        private final InputStream is;
        private final StringWriter sw= new StringWriter();
 
        public StreamReader(InputStream is) {
            this.is = is;
        }
 
        @Override
        public void run() {
            try {
                int c;
                while ((c = is.read()) != -1)
                    sw.write(c);
            } catch (IOException e) { 
            }
        }
 
        public String getResult() {
            return sw.toString();
        }
    }
    public static void main(String[] args) {
 
        // Sample usage
        String value = WindowsRegistry.readRegistry("HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion", "ProgramFilesDir");
        System.out.println(value);
    }
}