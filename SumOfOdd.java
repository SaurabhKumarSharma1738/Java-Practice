//sum of all odd number 1 to n using function...

import java.util.*;

public class SumOfOdd{
    public static void printSum(int n){
        int sum = 0;

        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.print(sum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the number :");
        int n = sc.nextInt();

        printSum(n);

    }
}