import java.util.*;

public class Array_Extending {
    public static void main(String[] args) throws Exception
    {
        int len_arr;
        System.out.println("Enter the size of Array: ");
        Scanner obj = new Scanner(System.in);
        len_arr = obj.nextInt();

        int[] arr = new int[len_arr];

        System.out.println("Enter "+len_arr+" Elements: ");
        for(int x=0; x<len_arr; x++) {
            Scanner obj2 = new Scanner(System.in);
            arr[x] = obj2.nextInt();
        }

        int a;
        System.out.println("Enter the new Element: ");
        Scanner obj1 = new Scanner(System.in);
        a = obj1.nextInt();

        int[] new_arr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[new_arr.length - 1] = a;

        System.out.print("Array before Sorting: ");
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
        Arrays.sort(new_arr);

        System.out.println(" ");
        System.out.print("Array after Sorting: ");
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
        System.out.println(" ");
    }
}
