class MyClass {
    int x, y;
    MyClass(int x, int y) {
        this.x = x;
        this.y= y;
    }
    public String Display (){
        return "x = "+this.x+ " y = "+ this.y;
    }
}
public class CheckStringReturn {
    public static void main(String[] args) {
        MyClass obj = new MyClass(10, 30);
        System.out.println(obj.Display());
    }
}
