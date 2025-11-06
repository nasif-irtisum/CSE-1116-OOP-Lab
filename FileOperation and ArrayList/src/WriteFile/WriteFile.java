package WriteFile;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class WriteFile {

    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            FileWriter f = new FileWriter("src/WriteFile/text1.txt", true);
            BufferedWriter w = new BufferedWriter(f);

            w.write("Hello World");
            w.newLine();
            w.write("This is Nasif");
            w.newLine();
            w.close();

            FileWriter f1 = new FileWriter("src/WriteFile/myFile.txt");
            BufferedWriter w1 = new BufferedWriter(f1);

            w1.write("Hellow World");
            w1.newLine();
            w1.flush();
            w1.write("We are learning codes");
            w1.close();

        }
        catch (Exception a) {
            a.printStackTrace();

        }
    }
}
