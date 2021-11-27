package Session7;
import com.oracle.tools.packager.IOUtils;

import java.io.BufferedReader;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;


public class FileUtils {
    private String base_address = "A:\\JAVA\\APLAB\\src\\Session7\\user\\";
    public void write_with_file_buffer(String name) {
        Boolean isDone = true;
        Scanner scan = new Scanner(System.in);
        System.out.println(base_address + "/" + name);
        File f = new File(base_address + "/" + name);
        try {
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        String msg;
        FileWriter fr = null;
        try {
            fr = new FileWriter(f);
            BufferedWriter br  = new BufferedWriter(fr);

            while (isDone) {
                msg = scan.nextLine();
                if (msg.equals("done")) {
                    isDone = false;
                }
                else {
                    try {
                        br.write(msg + "\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void summary_file() {
        File folder = new File(base_address);
        File[] listOfFiles = folder.listFiles();

        assert listOfFiles != null;
        for (File listOfFile : listOfFiles) {
            if (listOfFile.isFile()) {
                System.out.println("File " + listOfFile.getName());
                File f = new File(listOfFile.getPath());
                FileReader fr = null;
                try {
                    fr = new FileReader(f);
                    BufferedReader br  = new BufferedReader(fr);
                    System.out.println(br.readLine());
                    System.out.println();
                    br.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void read_with_file_buffer(String name) {
        File f = new File(base_address + "/" + name);
        FileReader fr = null;
        try {
            fr = new FileReader(f);
            BufferedReader br  = new BufferedReader(fr);
            String s = br.readLine();

            while (s!=null) {
                System.out.println(s);
                s = br.readLine();
            }

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete_file(String name) {
        File myObj = new File(base_address + "/" + name);
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public void write_with_file_streamer(String name) {
        Boolean isDone = true;
        String msg;
        Scanner scan = new Scanner(System.in);
        //Creating a File object
        File file = new File(base_address + "/" + name);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            while (isDone) {
                msg = scan.nextLine();
                if (msg.equals("done")) {
                    isDone = false;
                }
                else {
                    try {
                        outputStream.write((msg + "\n").getBytes());
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void read_with_file_streamer(String name) {
        File f = new File(base_address + "/" + name);
        //Creating a FileInputStream object
        try {
            FileInputStream inputStream = new FileInputStream(f);
            Scanner s = new Scanner(inputStream).useDelimiter("\\A");
            while (s.hasNext()) {
                System.out.println(s.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
