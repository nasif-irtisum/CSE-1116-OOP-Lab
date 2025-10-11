
import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter Byte Value: ");
        byte byt = sc.nextByte();

        System.out.print("Enter Short Value: ");
        short srt = sc.nextShort();

        System.out.print("Enter Integer Value: ");
        int value = sc.nextInt();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);


        System.out.println("Byte Value: "+byt);
        System.out.println("Short Value: "+srt);
        System.out.println("Integer Value: "+value);
        System.out.println("Character Value: "+ch);

    }
}
