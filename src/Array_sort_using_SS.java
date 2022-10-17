import java.util.Scanner;

public class Array_sort_using_SS {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]){
        int len_arr;
        System.out.println("Enter the size of Array: ");
        Scanner obj = new Scanner(System.in);
        len_arr = obj.nextInt();

        int arr1[] = new int[len_arr];

        System.out.println("Enter "+len_arr+" Elements: ");
        for(int x=0; x<len_arr; x++) {
            Scanner obj2 = new Scanner(System.in);
            arr1[x] = obj2.nextInt();
        }
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
