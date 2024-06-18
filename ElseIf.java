import java.util.*;

//printing the greeting message according to your choice
class ElseIf{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter the first number : ");
        int a = sc.nextInt();
        System.out.print(" enter the second number : ");
        int b = sc.nextInt();

        if(a==b){
            System.out.print("EQUAL");
         } else if(a>b){
                System.out.print("A IS GREATER THAN B");
            }
         else{
                System.out.print("A IS LESSER");
            }
        
        
    }
}