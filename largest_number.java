import java.util.Scanner;
class A{
      public static void main(String aa[])
      {
            Scanner ss=new Scanner(System.in);
            System.out.print("enter 1st number : ");
            int a=ss.nextInt();
                   System.out.print("enter 2nd number : ");
            int b=ss.nextInt();
                   System.out.print("enter 3rd number : ");
            int c=ss.nextInt();
            if(a>b && a>c){
                  System.out.print("A Is Largest");
            }
            else if(b>c){
                   System.out.print("B Is Largest");
            }
            else{
                   System.out.print("C Is Largest");
            }
      }
}