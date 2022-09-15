public class printing_left_mirror_triangle {
    public static void main(String args[])
    {
        int i, j;
        for (i=5; i>0; i--)
        {
            for (j=i; j>0; j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
