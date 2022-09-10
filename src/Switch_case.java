import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        int ch, r, l, b, h;
        double A;
        Scanner obj1= new Scanner(System.in);

        System.out.println("\n1. Area of Circle.");
        System.out.println("2. Area of Triangle.");
        System.out.println("3. Area of Rectangle/Square.");

        System.out.println("\nEnter Your Choice: ");
        ch=obj1.nextInt();

        switch(ch)
        {
            case 1:
                Scanner obj2= new Scanner(System.in);
                System.out.println("Enter Radius of Circle: ");
                r=obj2.nextInt();

                A=3.15*r*r;
                System.out.println("Area of radius ("+r+") is "+A);
                break;

            case 2:
                Scanner obj3= new Scanner(System.in);
                Scanner obj4= new Scanner(System.in);
                System.out.println("Enter Base of Triangle: ");
                b=obj3.nextInt();
                System.out.println("Enter Height of Triangle: ");
                h=obj4.nextInt();

                A=0.5*b*h;
                System.out.println("Area of triangle of base ("+b+") & height ("+h+") is "+A);
                break;

            case 3:
                Scanner obj5= new Scanner(System.in);
                Scanner obj6= new Scanner(System.in);
                System.out.println("Enter Length: ");
                l=obj5.nextInt();
                System.out.println("Enter Height: ");
                h=obj6.nextInt();

                A=l*h;
                System.out.println("Area of Rectangle/Square is: "+A);
                break;

            default:
                System.out.println("You have entered wrong choice.");
        }

    }
}
