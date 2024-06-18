import java.util.*;

//printing the greeting message according to your choice
class Switch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print(" ENTER YOUR CHOICE : ");
        int button = sc.nextInt();

        switch (button){
            case 1: System.out.print("HELLO");
                    break;
            case 2: System.out.print("NAMASTEY");
                    break;
            case 3: System.out.print("BONJOUR");
                    break;
            default: System.out.print("INVALID CHOICE");
        }
    }
}