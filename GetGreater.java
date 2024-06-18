//finding greatest number between two numbers using function

import java.util.*;

public class GetGreater{
    public static int getGreater(int a, int b){
       if(a > b){
            return a;
       }else{
            return b;
       }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.println("the greatest number is : "+getGreater(a, b));
    }
}    