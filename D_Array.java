//inputing a 2D array and finding the index of a particular number...

import java.util.*;

public class D_Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows :");
        int rows = sc.nextInt();
        System.out.print("enter number of columns :");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        //inputing two D array...
        //rows
        for(int i=0; i<rows; i++){
            //columns
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

         //printing two D array...
         for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        //number which to be found...
        System.out.print("enter the element you want to find :");
        int x = sc.nextInt();

        //printing the index of x...
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.print("number found at : ("+ i +", " + j +") ");
                }
            }
        }
    }
}            