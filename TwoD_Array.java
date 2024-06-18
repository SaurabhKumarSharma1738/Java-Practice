import java.util.*;

public class TwoD_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows :");
        int rows = sc.nextInt();
        System.out.print("enter number of columns :");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //inputing two D array
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        
        //printing two D array
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}            