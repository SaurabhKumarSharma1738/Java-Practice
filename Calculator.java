import java.util.*;

class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE FIRST NUMBER :");
        int a = sc.nextInt();
        System.out.print("ENTER THE SECOND NUMBER :");
        int b = sc.nextInt();

        System.out.print("ENTER 1 FOR ADDITION\n2 FOR SUBTRACTION\n3 FOR MULTIPLICATION\n4 FOR DIVISION\n5 FOR MODULO :");
        int n = sc.nextInt();

        switch(n){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
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
            default:System.out.println("INVALID CHOICE");
        }
    }
}