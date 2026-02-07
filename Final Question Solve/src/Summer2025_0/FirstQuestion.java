package Summer2025_0;

interface Writable {
    String write();
}
interface Refillable {
    void refill (String color);
}
interface WritableAndRefillable extends Writable, Refillable{

}
abstract class AbstractFountainPen { // Don not modify this line
    String name;
    AbstractFountainPen(String name) {
        this.name = name;
    }

}
class FountainPen extends AbstractFountainPen implements WritableAndRefillable{
    FountainPen(String s) {
        super(s);
    }
    public void refill(String color) {
        System.out.println("Refilling " + name + " color " + color);
    }
    public String write() {
        return "Writing with " + name;
    }
}

public class FirstQuestion {
    public static void main(String[] args) {
        Refillable matador = new FountainPen("Matador");
        Writable pentonic = new FountainPen("Pentonic");
        matador.refill("Blue");
        System.out.println(pentonic.write());
    }
}
