import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

class Info
{
    String name, number, email;

    public Info(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
}
public class FileRead {
    public static void main(String[] args) {
        ArrayList<Info>obj = new ArrayList<>();
        try{
            FileReader F = new FileReader("bla.txt");
            BufferedReader R = new BufferedReader(F);

            String line;
            String nm = " ";;

            while ((line = R.readLine())!=null) {
                String [] part = line.split("-");
                String tempName = part[0];
                part[0] = part[0].toUpperCase();
                nm = nm.toUpperCase();

                if (nm.equals(part[0])) {
                    txt2.append ("Name  : " + tempName+"\n");
                    txt2.append ("Phone : " + part[1]+"\n");
                    txt2.append("E-Mail : " + part[2]+"\n");
                    continue;
                }

                obj.add(new Info(tempName, part[1], part[2]));

            }
            R.close();
            FileWriter f = new FileWriter("", true);
            BufferedWriter w = new BufferedWriter(f);

            for (int i=0; i<obj.size(); i++) {
                w.write(obj.get(i).name+"-"+obj.get(i).number+"-"+obj.get(i).email);
                w.newLine();
            }
            w.close()

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
