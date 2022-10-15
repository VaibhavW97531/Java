//Program to display a multiplication table.

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int n, x, i=1;
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the table number: ");
        n=obj.nextInt();

        System.out.println("Multiplication Table for "+n+":");

        while(i<=10)
        {
            x = n*i;
            System.out.println(n+"*"+i+" = "+x);
            i++;
        }

    }
}
