package Session1;

public class Foreach {
    private static void printarray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        printarray(args);
    }
}
