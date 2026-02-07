package Summer2025_0;

import java.io.IOException;

public class Summer2025_1 {
    static void checkA(){
        System.out.println("Inside Check A");
        int [] arr = new int [4];
        try{
            System.out.println("Inside try of checkA");
            arr [5] = 7;
            throw new NumberFormatException("Thrown from try of checkA ");
        } catch (NumberFormatException a) {
            System.out.println("Exception caught inside catch of checkA: " + a.getMessage());
        } catch (Exception e){
            System.out.println("Hurry exception found");
        }
        finally{
            System.out.println("Inside finally of checkA");
        }
    }
    static void checkB() throws IOException {
        System.out.println("Inside checkB");
        try{
            System.out.println("Inside try of checkB");
            checkA();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught inside catch1 of checkB");
            throw new ArithmeticException("Thrown from catch1 of checkB");
        } catch (Exception e) {
            System.out.println("Exception caught inside catch2 of checkB");
            throw new IllegalArgumentException("Thrown from catch2 of checkB");
        }
    }

    public static void main(String[] args) throws RuntimeException {
        System.out.println("Main function start");
        try{
            System.out.println("Inside outer try of main");
            try{
                checkB();
                System.out.println("Inside inner try of main");
                throw new RuntimeException("Thrown from try of main");
            } catch (NullPointerException e){
                System.out.println("Exception caught inside inner catch of main: "+e.getMessage());
            }
            catch (IOException e) {
                System.out.println ("Universal Exception occured!");
            }
            catch (Exception a) {
                System.out.println("Exception occur somewhere");
            }
            finally {
                System.out.println("Inside inner finally of main");
            }
        }catch (ArithmeticException e) {
            System.out.println("Exception caught inside outer catch of main: " + e.getMessage());
        }
        System.out.println("Main function end.");
    }
}
