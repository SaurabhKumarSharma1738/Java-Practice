import java.util.*;

public class FunctionName{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the name :");
        String name = sc.nextLine();

        printMyName(name);
    }
}