package DemoQuestionSolve2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/DemoQuestionSolve2/input.txt");
            BufferedReader r = new BufferedReader(fr);

            FileWriter fw = new FileWriter("src/DemoQuestionSolve2/output.txt");
            BufferedWriter w = new BufferedWriter(fw);
            
            String line;
            int cnt=0;
            while ((line= r.readLine())!=null) {

                String [] s = line.split(" ");
                for (int i=0; i<s.length; i++) {
                    cnt++;
                    w.write("("+cnt+") "+s[i]+ " ");
                }
                w.newLine();
                w.flush();
            }
            w.close();
            r.close();
            
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}
