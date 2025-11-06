package ArrayList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class Student
{
    int id;
    String name;
    double cg;

    public Student(int id, String name, double cg) {
        this.id = id;
        this.name = name;
        this.cg = cg;
    }
}
public class ArrayListOfObj {
    public static void main(String[] args) {
        ArrayList<Student>objList = new ArrayList<>();

        try {
            FileReader f = new FileReader("src/ArrayList/info.txt");
            BufferedReader r = new BufferedReader(f);

            String line;

            while ((line = r.readLine())!=null) {
                String arr [] = line.split("-");
                Student st = new Student(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
                objList.add (st);
            }
            r.close();
            for (int i=0; i<objList.size(); i++) {
                System.out.println("Id: " + objList.get(i).id);
                System.out.println("Name: " + objList.get(i).name);
                System.out.println("Cg: " + objList.get(i).cg);

            }

            int mxIndex = 0;
            double mx = objList.get(0).cg;
            for (int i=1; i<objList.size(); i++) {
                if (objList.get(i).cg> mx) {
                    mx = objList.get(i).cg;
                    mxIndex = i;
                }
            }

            FileWriter fw = new FileWriter("src/ArrayList/Topper.txt", true);
            BufferedWriter w = new BufferedWriter(fw);

            w.write("Id: " + objList.get(mxIndex).id);
            w.newLine();
            w.write("Name: " + objList.get(mxIndex).name);
            w.newLine();
            w.write("CG: " + objList.get(mxIndex).cg);
            w.newLine();

            w.close();
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
}
