import java.util.*;

class IfElse{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number:");
        int a = sc.nextInt();
        System.out.print("enter the second number:");
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("A IS EQUAL TO B");
        }
        else{
           if(a>b)
             {
                System.out.println("A IS GREATER THEN B");
             }
             else
        {
            System.out.println("B IS GREATER THEN A");
        }
    }
        }
        
}