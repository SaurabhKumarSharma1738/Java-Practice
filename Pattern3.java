//printing * in form half pyramid...

import java.util.*;
class Pattern3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of lines you want to print :");
        int n = sc.nextInt();
       

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }    
    }
}