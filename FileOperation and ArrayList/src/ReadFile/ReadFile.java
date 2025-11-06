package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("src/ReadFile/myFile.txt");
            BufferedReader r = new BufferedReader(f);

            String info = r.readLine();
            System.out.println(info);

            String [] arr = info.split("-");

            System.out.println("Total Data: " + arr.length);
            System.out.println("Name: " + arr [0] + "\n" + "ID:" + arr [1]);

            int id = Integer.parseInt(arr[1]);
            double cg = Double.parseDouble(arr[2]);

            Student obj = new Student(arr[0],id, cg);
            obj.showData();


        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
}

class Student {
    String name;
    int id;
    double cg;

    public Student(String name, int id, double cg) {
        this.name = name;
        this.id = id;
        this.cg = cg;
    }

    void showData () {
        System.out.println("Student INFO:");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("CG: " + cg);
    }
}