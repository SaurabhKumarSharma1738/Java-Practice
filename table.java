import java.util.Scanner;
class A{
      public static void main(String aa[])
      {
            Scanner ss=new Scanner(System.in);
            System.out.print("enter 1st number : ");
            int a=ss.nextInt();
            for(int i=1; i<=10; i++)
            {
                  int b = a*i;
                  System.out.println(a+"X"+i+"="+b);
            }
      }
}