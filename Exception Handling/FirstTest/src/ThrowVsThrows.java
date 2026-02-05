class NegativeException extends Exception{
    NegativeException(String s) {
        super(s);
    }
}
public class ThrowVsThrows {
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static double area (int r) throws NegativeException {
        if (r<0) throw new NegativeException("Negative radius!!!");

        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            double a = area(-6);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
