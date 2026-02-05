class Adder extends Thread {
    int x, y;
    Adder (int x, int y){
        this.x = x;
        this.y = y;
    }
    int result = 0;

    public void run ()
    {
        for (int i=x; i<=y; i+=2) result +=i;
    }
}
public class Summer2024  {
    public static void main (String[] args) {
        Adder A = new Adder (1,50);
        Adder B = new Adder (2, 50);

        A.start();
        B.start();

        try{
            A.join();
            B.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(A.result-B.result);

    }
}
