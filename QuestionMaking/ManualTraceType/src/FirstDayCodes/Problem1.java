package FirstDayCodes;


public class Problem1 {
    {
        System.out.println("First Instance Block of Problem1 Class");
    }
    static int x = 20;
    int z;
    static {
        System.out.println("First Static Block of Problem1");
        x *= 3;
    }
    static {
        System.out.println("Second Static Block of Problem1");
    }
    static void showMsg (){
        x++;
        System.out.println("Static Function1");
    }
    static {
        showMsg();
        System.out.println("Value of x = "+ x);
    }
    Problem1 () {
        z = OurProblem.setValue();
        System.out.println("Value Z = "+z);
        this.z++;
    }
    {
        z = OurProblem.setValue();
    }
    public static void main (String [] args){
        Problem1 obj = new Problem1();
        System.out.println("Value of X = " + x);
    }
    static {
        System.out.println(OurProblem.msg);
    }
}

class OurProblem {
    static int y = 4;
    static String msg = "A Quick Brown Fox Jump Over The Lazy Dog";
    {
        System.out.println("OurProblem Instance Block1");
        y = Problem1.x;
        System.out.println("Value of y = " + y);
    }
    static {
        System.out.println("Our Problem First Static Block");
        Problem1.x = setValue();
    }
    OurProblem() {
        System.out.println("Default Constructor of OurProblem");
    }
    static int setValue() {
        System.out.println("Static Function SetValue");
        return 7;
    }
}