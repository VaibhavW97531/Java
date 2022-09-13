import java.util.Scanner;

import java.util.Scanner;

public class rev_of_digits {
    public static void main(String[] args) {
        int n, r, s=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n= obj.nextInt();

        while (n>0)
        {
            r = n % 10;
            s = s*10 + r;
            n = n / 10;
        }
        System.out.println("Reverse of digits: "+s);
    }
}
