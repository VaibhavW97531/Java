//Program to find the sum of digits of a given number.

import java.util.Scanner;

public class sum_of_digits_from_user {
    public static void main(String[] args) {
        int n, r, s=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        n= obj.nextInt();

        while (n>0)
        {
            r = n % 10;
            s = s + r;
            n = n / 10;
        }
        System.out.println("Sum of digits: "+s);
    }
}
