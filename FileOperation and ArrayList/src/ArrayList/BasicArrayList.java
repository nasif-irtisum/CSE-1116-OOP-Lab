package ArrayList;

import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();

        list.add ("Sony");
        list.add ("Lenovo");
        list.add ("Tesla");
        list.add ("LG");

        System.out.println("Size of ArrayList: " + list.size());

        list.add("Apple");
        list.add("Samsung");

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.remove("Tesla");
        list.remove(list.size()-1);

        System.out.println("-----New List-----");
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
