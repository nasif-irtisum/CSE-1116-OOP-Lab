class A extends Thread{
    public void run(){
        for (int i=1; i<=10; i++) {
            System.out.println("Hi");
        }
    }
}
class B extends Thread{
    public void run (){
        for (int i=1; i<=10; i++) {
            System.out.println("Hello");
        }
    }
}
public class MultipleThread {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B ();

        ob1.start();
        ob2.start();

        try{
            ob1.join();
            ob2.join();

        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Program Ends!");
    }
}
