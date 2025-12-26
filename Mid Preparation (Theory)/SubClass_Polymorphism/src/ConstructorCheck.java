import java.lang.Object;

public class ConstructorCheck {
    private int k;

    ConstructorCheck(int k) {
        this.k = k;
    }
    int get_K() {
        return k;
    }
    double getPi (){
        return 3.1416;
    }
}
class ConsClass extends ConstructorCheck {

    ConsClass(int k) {
        super(k);
    }
    double getSquare () {
        int num = get_K();
        return Math.sqrt(num);
    }
}
class MainClass {

    ConstructorCheck obj = new ConstructorCheck(5);
    ConstructorCheck obj2 = new ConstructorCheck(2);



    public static void main(String[] args) {
        ConstructorCheck newObj = new ConsClass(36);
        double value = ((ConsClass)newObj).getSquare();
        System.out.println(value);
        System.out.println(newObj.getPi());
    }
}