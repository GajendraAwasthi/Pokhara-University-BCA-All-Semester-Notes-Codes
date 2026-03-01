import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class ReadAndWrite {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
     try {


         FileOutputStream fout = new FileOutputStream("data.bin");
         System.out.print("Enter a character: ");
         byte data = (byte) sc.next().charAt(0);
         fout.write(data);
         fout.close();


         FileInputStream fin = new FileInputStream("data.bin");
         int readData = fin.read();
         System.out.println("Read 8-bit data from file: " + (char) readData);
         fin.close();

     }catch (Exception e){
         System.out.println("File error...");

     }
     sc.close();
    }
}
