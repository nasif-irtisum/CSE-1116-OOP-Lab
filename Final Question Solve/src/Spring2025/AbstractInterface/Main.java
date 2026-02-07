package Spring2025.AbstractInterface;
interface Computable {
    int compute(int a, int b);
}

//Task1
interface AdvancedComputable extends Computable{
     int max();
} 

abstract class Processor {
    protected String id;
    public Processor(String id) {
        this.id = id;
    }
    public abstract void process();
    public void printId() {
        System.out.println("Processor ID: " + id);
    }
}
class Adder extends Processor implements AdvancedComputable{
    int a, b;
    Adder(int a, int b, String id) {
        super(id);
        this.a = a;
        this.b = b;
    }
    public int compute(int a, int b){
        return a+b;
    }
    public int max () {
        if (a>b) return a;
        else return b;
    }
    public void process() {
        System.out.println("Process Edition");
    }
}
public class Main {
}
