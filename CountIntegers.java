//counting number of positives, negatives and zeroes entered...

import java.util.*;

public class CountIntegers{
    public static void main(String args []){
        int positive = 0; int negative = 0; int zeroes = 0;
        System.out.print("enter 1 to continue & 0 to stop :");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input == 1){
            System.out.print("enter your number :");
            int number = sc.nextInt();

            if(number > 0){
                positive++;
            }else if(number < 0){
                negative++;
            }else{
                zeroes++;
            }
            System.out.print("press 1 to continue & 0 to stop :");
            input = sc.nextInt();
        }
        System.out.println("positives :"+positive);
        System.out.println("nagetives :"+negative);
        System.out.println("zeroes :"+zeroes);

    }
}