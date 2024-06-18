//average of three numbers using function...

import java.util.*;

public class FunctionAverage{
    public static float calculateAverage(int a, int b, int c){
        float average = (a+b+c)/3;
        return average;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.print("enter the third number :");
        int c = sc.nextInt();

        float average = calculateAverage(a, b, c);
        System.out.print("Average of three numbers :"+average);       
    }
}