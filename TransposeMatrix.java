//printing the transpose of the matrix...

import java.util.*;

public class TransposeMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows :");
        int n = sc.nextInt();
        System.out.print("enter number of columns :");
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

          //inputing two D array...
        //rows
        for(int i=0; i<n; i++){
            //columns
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Transpose is :");

        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        
        }
    }
}
