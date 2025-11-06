import java.io.BufferedWriter;
import java.io.FileWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         try{
             FileWriter f = new FileWriter("", true);
             BufferedWriter w = new BufferedWriter(f);

             w.write(data1.getText()+"-");
             w.write(data2.getText()+"-");
             w.write(data3.getText()+"-");
             w.newLine();

             w.close();

         }
         catch (Exception a) {
             a.printStackTrace();
         }
    }
}