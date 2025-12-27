import com.sun.security.jgss.GSSUtil;

public class Animal {
    double height = 5.2, weight = 50.35;

    void sleep()
    {
        System.out.println("Animal Sleep");
    }
    void type () {
        System.out.println("Not HUMAN");
    }
    static void stFunc (){
        System.out.println("Hello from static func");
    }
}
class Bird extends Animal {

}
class Horse extends Animal
{
    void sleep () {
        System.out.println("Horse sleeps");
        stFunc();

    }
    void run ()
    {
        System.out.println("Horse Run");
    }
}
class Main {
    public static void main(String[] args) {
        Animal an1 = new Horse();
        an1.sleep();

        Animal an2 = new Bird();
        an2.sleep();

        if (an1 instanceof Horse) {
            ((Horse) an1).run();
        }
        an2.type();
    }
}