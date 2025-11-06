package Assignment;

public class Alpha {
    int m = initM();
    static int x = 5;
    static {
        System.out.println("Alpha: static block 1");
    }
    static {
        System.out.println("Alpha: static block 2");
    }

    Alpha() {
        this(Beta.y);
        System.out.println("Alpha: no-arg ctor");
    }

    Alpha(int m) {
        System.out.println("Alpha: one-arg ctor, m=" + m);
    }

    int initM() { return 7; }

    final void show() {
        System.out.println("Alpha: show(), m=" + m + ", x=" + x);
    }

    public static void main(String[] args) {
        System.out.println("MAIN: start");
        Alpha a = new Alpha();
        Beta.display();
        Beta b = new Beta();
        b.display();
        a.show();
        System.out.println("MAIN: end");
    }
}

class Beta {
    static int y;
    int z = initZ();

    static {
        y = initY();
        System.out.println("Beta: static block 1");
    }

    static {
        System.out.println("Beta: static block 2");
    }

    {
        System.out.println("Beta: instance block");
    }

    Beta() {
        y = 42;
        System.out.println("Beta: no-arg ctor");
    }

    static void display() {
        System.out.println("Beta: display(), y=" + y);
    }

    static int initY() {
        System.out.println("Beta: static var y init");
        return 11;
    }

    int initZ() {
        return 22;
    }
}