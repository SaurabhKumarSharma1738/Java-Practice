import java.util.Scanner;
class A{

    public static void main(String[] args){

        int x[] = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 values :");
        for(int i=0;i<x.length;i++)
        {
            x[i]= sc.nextInt();
        }
        System.out.print("values are :");
        for(int i=0;i< x.length;i++)
        {
            System.out.print(x[i]+" ");
        }
    }
}