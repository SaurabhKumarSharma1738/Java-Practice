//circumference of circle using function...

import java.util.*;

public class GetCircumference{
    public static double getCircumference(double radius){
        return 2 * 3.14 * radius;    
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius of circle :");
        double r = sc.nextDouble();
        System.out.println("circumference of circle is :"+getCircumference(r));
    }
}
