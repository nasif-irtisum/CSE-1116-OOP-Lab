package Summer2025_0.FileReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        int cnt=0;

        try{
            FileReader fr = new FileReader("src/Summer2025_0/FileReadWrite/input.txt");
            BufferedReader r = new BufferedReader(fr);

            FileWriter fw = new FileWriter("src/Summer2025_0/FileReadWrite/output.txt");
            BufferedWriter w = new BufferedWriter(fw);

            String line;

            while ((line = r.readLine())!=null) {
                String [] arr = line.split(" ");
                cnt += arr.length;
            }
            w.write("Number of words: " + cnt);
            w.close();
            r.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
