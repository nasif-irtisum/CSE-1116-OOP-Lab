public class Main
{
    int num;
    public static void main(String[] args) {
        Main obj = new Main ();
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());

        Main obj2 = new Main();

        System.out.println(obj==obj2);
        System.out.println(obj.equals(obj2));

        Main obj3 = obj;

        System.out.println(obj==obj3);
        System.out.println(obj.equals(obj3));

        obj.num = 10;
        obj2.num = 10;

        System.out.println(obj.num==obj2.num);

        // Wrong
        //System.out.println(obj.num.equals(obj2.num));

    }
}