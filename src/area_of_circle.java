import java.util.Scanner;

public class area_of_circle {

    public static void main(String[] args) {

        // Variable Declaration.
        float r;
        double A;

        // Taking inputs from user.
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Value of Radius: ");
        r=obj.nextFloat();

        A=3.14*r*r;
        System.out.println("Area of Circle with radius "+r+" is "+A);
    }
}
