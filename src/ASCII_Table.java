import java.util.Scanner;

public class ASCII_Table {
        public static void main(String[] args) {
            System.out.println("Test Project");
            int i = 1;
            System.out.println("Enter the number: ");
            Scanner scanner = new Scanner(System.in);
            int test = scanner.nextInt();
            System.out.println("Entered number is " + test);
            while (i != test + 1) {
                int ca = i + 64;
                System.out.println("Value of Char" + i + " = " + (char) ca);
                i++;
            }
        }
}
