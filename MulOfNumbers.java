import java.util.*;
 
class MulOfNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :");
        int n = sc.nextInt();

        int mul = 1;
        for(int i = 1; i <= n; i++){
         mul = mul*i;
        }
        System.out.print(mul);
    }
}