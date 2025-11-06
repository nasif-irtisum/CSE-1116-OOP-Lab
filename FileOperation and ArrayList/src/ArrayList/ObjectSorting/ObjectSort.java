package ArrayList.ObjectSorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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


public class ObjectSort {
    public static void main(String[] args) {
        ArrayList<Student>objList = new ArrayList<>();

        try {
            FileReader f = new FileReader("src/ArrayList/ObjectSorting/info.txt");
            BufferedReader r = new BufferedReader(f);

            String line;

            while ((line = r.readLine())!=null) {
                String arr [] = line.split("-");
                Student st = new Student(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]));
                objList.add (st);
            }
            r.close();

            Collections.sort(objList, new NewComperator());

            FileWriter fw = new FileWriter("src/ArrayList/ObjectSorting/Topper.txt");
            BufferedWriter w = new BufferedWriter(fw);

            for (int i=0; i<objList.size(); i++) {
                w.write("Id: " + objList.get(i).id + " Name: " + objList.get(i).name + " CG: " + objList.get(i).cg);
                w.newLine();
            }


            w.close();
        }
        catch (Exception a) {
            a.printStackTrace();
        }
    }
}

class NewComperator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.cg < o2.cg) return 1;
        else return -1;
    }
}
