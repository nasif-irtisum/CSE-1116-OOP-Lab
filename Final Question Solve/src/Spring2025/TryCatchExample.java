package Spring2025;
import java.util.Scanner;
public class TryCatchExample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"10","0",null};
        System.out.print("Enter index (0-2): ");
        int index = sc.nextInt();
        try {
            int value = Integer.parseInt(arr[index]);
            try {
                int result = 100 / value;
                System.out.println("Result = " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: ArithmeticException");
            }
            finally {
                System.out.println("Inner finally block executed.");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Outer catch: ArithmeticException");
        }
        catch (NumberFormatException e) {
            System.out.println("Outer catch: NumberFormatException");
        }
        finally {
            System.out.println("Outer finally block executed.");
        }
    }
}