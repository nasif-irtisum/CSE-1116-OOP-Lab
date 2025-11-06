import Assignment.Alpha;

class FirstClass extends  Alpha{
    static {
        System.out.println("Hello Static First Class");
    }
    {
        System.out.println("First Class Instance block");
    }
    public void showMsg (String str) {
        System.out.println("Hello"+str);
    }
    final void myMsg() {
        System.out.println("Hello World Baccha");
    }
}

class SecondClass extends FirstClass {
    {
        System.out.println("Instance Block Class 2");;
    }
    static void display()
    {
        System.out.println("Hello World");
    }
    static {
        System.out.println("inside 2nd class static block");
    }
    static {
        System.out.println("inside 2nd class static block Number 2");
    }
    public void showMsg () {
        System.out.println("Hello World");
    }
}
class ThirdClass extends FirstClass{
    void showMsg () {
        System.out.println("Hello fro third class");
    }
    
}

public class Main{
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        new SecondClass().showMsg(" abul");
//        new SecondClass().showMsg();
//        FirstClass obj = new SecondClass();
//
//        boolean bl = obj instanceof SecondClass;
//        System.out.println(bl);
//
//        FirstClass [] f = new FirstClass [3];
//
//        f[0] = new SecondClass();
//        f[1] = new ThirdClass();

         SecondClass.display();
    }
}