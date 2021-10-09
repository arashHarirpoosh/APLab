package Session1.HW1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String li = "";
        String[] li_parts;
        ComplexNumber cnum1 = null, cnum2 = null;
        ArrayList<String> output = new ArrayList<String>();
        for (int i = 0; i < 2; i++) {
            li = input.nextLine();
            li_parts = li.split(" ");
            if (i == 0){
                cnum1 = new ComplexNumber(Integer.parseInt(li_parts[0]), Integer.parseInt(li_parts[1]));
            }
            else {
                cnum2 = new ComplexNumber(Integer.parseInt(li_parts[0]), Integer.parseInt(li_parts[1]));
            }
        }
        while (!li.equals("#")){
            li = input.nextLine();
            li_parts = li.split(" ");
            if (li_parts.length == 1) {
                switch (li_parts[0]){
                    case "+":
                        output.add(cnum1.add(cnum2).toString());
                        break;
                    case "-":
                        output.add(cnum1.minus(cnum2).toString());
                        break;
                    case "*":
                        output.add(cnum1.multiply(cnum2).toString());
                        break;
                    case "/":
                        output.add(cnum1.divide(cnum2).toString());
                        break;
                }

            }
        }
        for (String anOutput : output) {
            System.out.println(anOutput);

        }
    }
}
