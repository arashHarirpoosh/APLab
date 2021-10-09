package Session1.HW1;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();
        int key_num = Integer.parseInt(key, 2);
        StringBuilder map_value = new StringBuilder();
        int xor_res;
        String word = input.nextLine();
        for (int i = 0; i < word.length(); i++) {
             xor_res = key_num ^ (int)word.charAt(i);
             map_value.append(Integer.toBinaryString(xor_res)).append(" ");
        }
        System.out.println(map_value.toString());

    }
}
