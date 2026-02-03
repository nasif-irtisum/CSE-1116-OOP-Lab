import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

class BusinessMan implements Comparable<BusinessMan>{
    String name;
    int rank;

    public BusinessMan(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(BusinessMan o) {
        if (rank < o.rank) return 1;
        else if (rank>o.rank) return -1;
        return 0;

    }

    @Override
    public String toString() {
        return name + " " +  rank;
    }
}
public class DemoQuestionSolve1 {

    public static void main(String[] args) {
        ArrayList<BusinessMan>myList = new ArrayList<>();
        try{
            FileReader f = new FileReader("src/input.txt");
            BufferedReader r = new BufferedReader(f);

            String line;

            while ((line= r.readLine())!=null) {
                String str [] = line.split(" ");
                BusinessMan b = new BusinessMan(str[0], Integer.parseInt(str[1]));
                myList.add(b);
            }
            r.close();
            Collections.sort(myList);
            System.out.println(myList);

            FileWriter fw = new FileWriter("output.txt", true);
            BufferedWriter.w = new BufferedWriter(fw);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
