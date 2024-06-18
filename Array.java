import java.util.Scanner;
class Array
{
    public static void main(String [] args)
    {
        int[] a = {23, 45, 67, 43};
        int[] b = {4,7,78,90,345,67,889,443,78,};
        int[] c = {34,23,34};
        int[][] x= {a,b,c};     /*multidimensional array */
        System.out.println(x.length);
        System.out.println(x[0].length);
        System.out.println(x[1].length);
        System.out.println(x[2].length);
        System.out.println(x[1][3]);
        System.out.println();
        for(int i =0; i<x.length; i++)    /*printing the array in separate lines */
        {
            for(int j=0; j<x[i].length; j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }


    }
}