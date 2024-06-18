import java.util.*;

public class FoundElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.print("enter the size of array :");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        //input 
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("enter the number you want to find :");
        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.print("number found at index :"+i);
            }
        }
    }
    
}
