import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        // Part 1: Copy from source to destination using Byte Streams
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {
            
            // TODO: Declare an integer variable to hold the byte read
            byte[] buffer = new byte[1024];
            int byteData;
            // TODO: Read from 'fis' until it returns -1
            while ((byteData = fis.read(buffer))!=-1){
              fos.write(buffer, 0, byteData);
            }
            // TODO: Write the byte read to 'fos'
            

        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
            return; // Exit if copy fails
        }

        System.out.println("File Copied");

        // Part 2: Read and display the contents of the newly created destination file
        try (FileInputStream fis = new FileInputStream(destFile)) {
            
            // TODO: Read from 'fis' and print each byte as a character to the console
            // Hint: use (char) to cast the integer byte to a character before printing
            byte[] buffer2 = new byte[1024];
            int byteData2;
            while ((byteData2 = fis.read(buffer2))!=-1){
              for(int i=0; i<byteData2; i++)
              System.out.print((char) buffer2[i]);
            }

        } catch (IOException e) {
            System.out.println("Error reading destination file: " + e.getMessage());
        }
    }
}
