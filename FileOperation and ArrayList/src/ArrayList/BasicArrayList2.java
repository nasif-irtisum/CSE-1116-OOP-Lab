package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BasicArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers");
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            int num = sc.nextInt();
            numbers.add (num);
        }
        System.out.println("You Entered: ");

        for (int i=0; i<numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        
        Collections.sort(numbers);

        System.out.println("After Sorting: ");

        for (int i=0; i<numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("After Reverse Sorting: ");

        for (int i=0; i<numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
    }
}
