class RunnableThread implements Runnable{
    public void run(){
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
        System.out.println("I'm a thread (1)");
    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
        System.out.println("I'm a thread (2)");
    }
}

public class RunnableImplement {
    public static void main(String[] args) {
        RunnableThread t1 = new RunnableThread();
        Thread th1 = new Thread(t1);

        RunnableThread2 t2 = new RunnableThread2();
        Thread th2 = new Thread (t2);

        th1.start();
        th2.start();
    }
}
