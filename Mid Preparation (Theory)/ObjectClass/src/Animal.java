public class Animal {
    // Instance Fields (shared between Animal and Pokemon)
    public String color;
    public String name;

    // Constructor
    public Animal() {
        System.out.println("Default animal");
        color = "Unknown"; // Explicitly sets color
    }

    // Method
    public void showNameColor() {
        System.out.println("Color is: " + color + " Name is: " + name);
    }

    // Instance Initialization Block (executed before the constructor)
    {
        System.out.println("Animal instance initialization");
    }
}
class Pk extends Animal{
    public String name = "Pikachu";
    public String color = "Red";
}

class Pokemon extends Pk{
    // Instance Fields (shadowing the fields inherited from Animal)
    public String name = "Pikachu";
    public String color = "Red";

     Pokemon(){
        super.name = "Big";
        super.color = "Boss";
    }
    // No explicit constructor, default public Pokemon() is used
}
class AnimalTest {
    public static void main(String[] args) {
        // Step 1: Create a plain Animal object
        Animal defaultAnimal = new Animal();

        // Step 2: Create a Pokemon object, referenced as an Animal (Polymorphism)
        Animal pk = new Pokemon();

        // Step 3: Call method on the Animal object
        defaultAnimal.showNameColor();

        // Step 4: Call method on the Pokemon object
        pk.showNameColor();
    }
}