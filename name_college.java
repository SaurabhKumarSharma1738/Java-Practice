import java.util.Scanner;
class Student
{
       String name;
       static String college;
}
class A
{
      public static void main(String aa[])
      {
       Student s1,s2;
       s1=new Student(); 
       s2=new Student();
       Student s3=new Student();
       s1.name= "Saurabh";
       s1.college= "SSVGI";
       s2.name= "Rajat";
       s3.name= "Vishwa";
       System.out.println(s1.name);
       System.out.println(s1.college);
       System.out.println(s2.name);
       System.out.println(s2.college);
       System.out.println(s3.name);
       System.out.println(s3.college);
       }
}
