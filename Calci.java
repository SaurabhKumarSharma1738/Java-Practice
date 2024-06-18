import java.util.*;

class Calci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number :");
        int a = sc.nextInt();
        System.out.print("enter the second number :");
        int b = sc.nextInt();
        System.out.print("enter the operator :");
        int operator = sc.nextInt();
        
        
        /*

         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %

         */


         switch(operator){
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b==0){
                          System.out.println("invalid division");
                    } else{
                            System.out.println(a/b);
                        }
            break;
            case 5:if(b==0){
                      System.out.println("invalid division");
                    } else{
                            System.out.println(a%b);
                        }
         break;
         default:   System.out.println("invalid operator");
         }
    }
}