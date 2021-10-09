package Session1;

import java.util.Scanner;

public class ComputeGCD {
    private static int GCD(int a, int b) {
        int temp;
        while(b!=0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int in1 = input.nextInt();
//        int in2 = input.nextInt();
        int in1 = 5;
        int in2 = 17;
        int a, b;
        if (in1 > in2){
            a = in1;
            b = in2;
        }
        else {
            a = in2;
            b = in1;
        }
        a = GCD(a, b);
        if (a==1){
            System.out.println("Two Numbers Are Primary To Each Other");
        }
        else {
            System.out.println("Two Numbers Are Not Primary To Each Other");

        }
    }

}
