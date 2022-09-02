import java.util.Scanner;

public class area_of_triangle {

    public static void main(String[] args) {

        // Variable Declaration.
        float b, h;
        double A;

        // Taking inputs from user.
        Scanner obj1=new Scanner(System.in);
        System.out.println("Enter the length of base: ");
        b=obj1.nextFloat();

        Scanner obj2=new Scanner(System.in);
        System.out.println("Enter the length of height: ");
        h=obj2.nextFloat();

        A=0.5*b*h;
        System.out.println("Area of Triangle with base "+b+" and height "+h+" is "+A);
    }
}