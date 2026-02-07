package Spring2025.ReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class Student {
    int id;
    String name;
    int mark1, mark2;

    Student(int id, String name, int mark1, int mark2) {
        this.id = id;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/Spring2025/ReadWrite/student.txt");
            BufferedReader r = new BufferedReader(fr);

            FileWriter f1 = new FileWriter("src/Spring2025/ReadWrite/info.txt");
            FileWriter f2 = new FileWriter("src/Spring2025/ReadWrite/mark.txt");

            BufferedWriter w1 = new BufferedWriter(f1);
            BufferedWriter w2 = new BufferedWriter(f2);
;
            String line;
            while((line = r.readLine())!=null) {
                String [] str = line.split(" ");

                w1.write(str[0] + " " + str[1]);
                w1.newLine();
                w1.flush();

                int totalMarks = Integer.parseInt(str[2])+Integer.parseInt(str[3]);
                w2.write(str[1] +" "+totalMarks+"\n");
                w2.flush();


            }
            r.close();
            w1.close();
            w2.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
