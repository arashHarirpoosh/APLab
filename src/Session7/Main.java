package Session7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileUtils fu = new FileUtils();
        Scanner input = new Scanner(System.in);
        String msg, name, mtd;
        boolean cont = true;
        while (cont)
        {
            msg = input.nextLine();
            switch (msg){
                case "write":
                    System.out.println("Method:");
                    mtd = input.nextLine();
                    System.out.println("Enter name of the file:");
                    if (mtd.equals("buffer")){
                        fu.write_with_file_buffer(input.nextLine());
                    }
                    else {
                        fu.write_with_file_streamer(input.nextLine());
                    }
                    System.out.println("---------------------------------");
                    break;
                case "summary":
                    fu.summary_file();
                    System.out.println("---------------------------------");
                    break;
                case "open":
                    System.out.println("Method:");
                    mtd = input.nextLine();
                    System.out.println("Enter name of the file:");
                    name = input.nextLine();
                    if (mtd.equals("buffer")){
                        fu.read_with_file_buffer(name);
                    }
                    else {
                        fu.read_with_file_streamer(name);
                    }
                    System.out.println("---------------------------------");
                    break;
                case "remove":
                    System.out.println("Enter name of the file:");
                    name = input.nextLine();
                    fu.delete_file(name);
                    System.out.println("---------------------------------");
                    break;
                default:
                    cont = false;
                    break;
            }


        }
    }


}
