class MyClass {
    int a = 10, b = 20;
    double Pi = 3.1416;
    char c = 'A';

    {
        a+=10;
        System.out.println(Pi);
        System.out.println ("b = "+ (b=b-=5));
    }
    {
        c = 'N';
        System.out.println("b = " + b);
    }
    MyClass() {
        System.out.println("This Parent Class");
    }
    static {
        System.out.println("Parent Class Static Block");
    }
    static int st = 100;
}
class MyClass2 extends MyClass {
    int a = -200;
    {
        System.out.println("Welcome MyClass2");
    }
    MyClass2 () {
        System.out.println("This is MyClass2 Constructor");
        System.out.println("a = " + super.a);
    }
    static {
        System.out.println("Static Block of MyClass2");
    }
    {
        System.out.println(st);
        st-=50;
        System.out.println("a = " + a);
    }
}

public class Main extends MyClass2 {

    static {
        System.out.println("This is main class");
        System.out.println(st);
    }

    public static void main(String[] args) {
        Main obj = new Main ();
        obj.b = 60;
        MyClass obj2 = new Main();
        System.out.println(obj.b + " " + obj2.b);
        obj.st =200;
        System.out.println(obj.st++ + " " + obj2.st);
        callFunction();
        Main obj3 = new Main ();
    }
    static void callFunction () {
        Main obj = new Main ();
        MyClass obj2 = new Main ();
    }
    {
        System.out.println("Main Function Starts here");
    }
}