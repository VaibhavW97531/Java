import java.util.Scanner;

public class addition_of_digits {

    public static void main(String[] args) {
        int number;
        Scanner obj1=new Scanner(System.in);
        System.out.println(" Enter any number: ");
        number=obj1.nextInt();
        int sum = add(number);
        System.out.println(" Sum of digits of " + number + " is " + sum);
    }

    static int add(int number) {
        // check if the number is 0
        if (number == 0) {
            return 0;
        }
        // get the last digit of number
        int lastDigit = number % 10;
        // call this method again with the sum of digit and remaining number
        return lastDigit + add(number / 10);
    }
}
