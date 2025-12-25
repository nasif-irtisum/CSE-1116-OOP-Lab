public class CheckString {
    int x = 700;
    String message () {
        return "Hello" + --x + " "+ x++ +  "Bangladesh" + 11+x;
    }

    public static void main(String[] args) {
        System.out.println(new CheckString().message());
    }
}

