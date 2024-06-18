import java.util.*;

public class FunctionFactorial{
    public static void printFactorial(int n){
        if(n < 0){
            System.out.print("INVALID NUMBER");
            return;
        }

        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial*i;
        }

        System.out.println("factorial of the number is :"+factorial);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = sc.nextInt();

        printFactorial(n);
    }

}