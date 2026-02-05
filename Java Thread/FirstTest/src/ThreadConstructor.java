class MyTh extends  Thread{
    public MyTh(String name){
        super(name);
    }
    public void run (){
        int i=1;

        while (true){
            System.out.println("This is a Thread");

            if(i==5) break;
            i++;
        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        MyTh obj = new MyTh("Xarvis");
        obj.start();

        System.out.println("Thread ID: " + obj.getId());
        System.out.println("Thread Name: " + obj.getName());
    }
}
