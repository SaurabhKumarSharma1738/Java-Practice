//elligible to vote or not...

import java.util.*;

public class Elligible{
       public static boolean isElligible(int age){
              if(age > 18){
                     return true ;
              }else{
                     return false ;
              }
       }

       public static void main(String args[]){
              Scanner sc = new Scanner(System.in);
              System.out.print("enter the age of voter :");
              int age = sc.nextInt();
              System.out.print("elligible to vote"+isElligible(age));
       }
}