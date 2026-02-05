class MyThread extends Thread{
    @Override
    public void run(){
        int i=100;
        while (i > 0) {
            System.out.println(i + "--My thread is running...");
            System.out.println("I'm happy.");
            if (i == 95) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            i--;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=100;
        while (i>0) {
            System.out.println(i+ "--My thread --2-- is good...");
            System.out.println("I'm happy (2).");

            if (i==70 || i==25) {
                try{
                    Thread.sleep(3000);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            i=i-1;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}