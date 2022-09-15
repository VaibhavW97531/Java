public class printing_right_left_mirror_triangles {
    public static void main(String[] args) {
        int i, j;
        for (i = 5; i>0; i--)
        {
            for (j = i; j >0; j--)
            {
                System.out.print("* ");
            }
            for (j=0; j<=4*(5-i); j++)
            {
                System.out.print(" ");
            }
            for (j=i; j>0; j-- )
            {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
