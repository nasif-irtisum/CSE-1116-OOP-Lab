import java.util.Scanner;

class Multiplier extends Thread {
    double a; double b;
    int result = 1;
    public Multiplier(double a, double b){
        this.a = a;
        this.b = b;
    }
    public void run (){
        for (double i=a; i<=b; i++){
            result *= i;
        }
    }
}
public class Summer2025 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n= Sc.nextInt();

        Multiplier obj1 = new Multiplier(1, (Math.ceil(n/2)));
        Multiplier obj2 = new Multiplier(Math.ceil(n/2)+1, n);

        obj1.start();
        obj2.start();
        try {
            obj1.join();
            obj2.join();
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println(obj1.result*obj2.result);
        }
    }
}
