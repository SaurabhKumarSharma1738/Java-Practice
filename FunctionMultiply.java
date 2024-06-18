import java.util.*;

public class FunctionMultiply{
    public static int calculateMul(int a, int b){
        int mul = a*b;
        return mul;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();

        int mul = calculateMul(a, b);
        System.out.print("multiplication of two numbers :"+mul);
    }
}