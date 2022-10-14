
//Program to check whether two strings are equal or not.

import java.util.Scanner;

public class Equal_String {
    public static void main(String[] args) {

        Scanner obj1=new Scanner(System.in);
        Scanner obj2=new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String a=obj1.next();

        System.out.println("Enter the second string: ");
        String b=obj2.next();


        if (a.equals(b)) {
            System.out.println("Both Strings are equal");
        }
        else {
            System.out.println("Both Strings are not equal");
        }
    }
}
