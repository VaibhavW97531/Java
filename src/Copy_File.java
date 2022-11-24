import java.io.*;
import java.util.*;

public class Copy_File {
        public static void copyContent(File a, File b)
                throws Exception
        {
            FileInputStream in = new FileInputStream(a);
            FileOutputStream out = new FileOutputStream(b);

            try {

                int n;

                // read() function to read the
                // byte of data
                while ((n = in.read()) != -1) {
                    // write() function to write
                    // the byte of data
                    out.write(n);
                }
            }
            finally {
                if (in != null) {

                    // close() function to close the
                    // stream
                    in.close();
                }
                // close() function to close
                // the stream
                if (out != null) {
                    out.close();
                }
            }
            System.out.println("File Copied");
        }

        public static void main(String[] args) throws Exception
        {
            Scanner sc = new Scanner(System.in);
            Scanner cp = new Scanner(System.in);
            // get the source file name
            System.out.println(
                    "Enter the source filename from where you have to read/copy :");
            String a = sc.nextLine();

            // source file
            File x = new File("C:\\Users\\dgfdg\\IdeaProjects\\Java\\src\\"+a+".txt");

            // get the destination file name
            System.out.println(
                    "Enter the destination filename where you have to write/paste :");
            String b = sc.nextLine();

            // destination file
            File y = new File("C:\\Users\\dgfdg\\IdeaProjects\\Java\\src\\"+b+".txt");

            // method called to copy the
            // contents from x to y
            System.out.println("Do you Want Copy the file (Y/N)");
            String c=cp.nextLine();
            String d="Y";
            if (c.equals(d)) {
                copyContent(x, y);
            }
            else{
                System.out.println("File not Copied");
            }
        }
    }
