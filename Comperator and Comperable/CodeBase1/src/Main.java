import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(3);
        myList.add (500);
        myList.add(-82);
        myList.add(7);
        myList.add (11);
        myList.add(-13);

        Collections.sort(myList);
        System.out.println(myList);

        Collections.sort(myList, Collections.reverseOrder());
        System.out.println(myList);

//        System.out.println(myList.get(2));
    }

}