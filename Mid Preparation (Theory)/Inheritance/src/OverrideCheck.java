public class OverrideCheck {
    public int myNumber() {
        return 80;
    }
}
class Checker extends  OverrideCheck{
    @Override
    public int myNumber() {
        return 100;
    }
}
class MyMain extends Checker{
    public static void main(String[] args) {
        MyMain obj = new MyMain();
        System.out.println(obj.myNumber());
    }
}
