
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

// Create a comparator
class SortByYear implements Comparator <Car> {
    public int compare(Car obj1, Car obj2) {
        // Make sure that the objects are Car objects
//        Car a = (Car) obj1;
//        Car b = (Car) obj2;

        // Compare the year of both objects
        if (obj1.year < obj2.year) return -1; // The first car has a smaller year
        if (obj1.year > obj2.year) return 1;  // The first car has a larger year
        return 0; // Both cars have the same year
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("BMW", "X5", 1999));
        myCars.add(new Car("Honda", "Accord", 2006));
        myCars.add(new Car("Ford", "Mustang", 1970));

        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        // Display the cars
        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}