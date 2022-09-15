public class printing_right_mirror_triangle {
    public static void main(String[] args)
    {
        int i, j;
        for (i=5; i>0; i--)
        {
            for (j=2*(5-i); j>=0; j--)
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
