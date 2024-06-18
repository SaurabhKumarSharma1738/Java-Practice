import java.util.Scanner;
class Student
{
   String name;
   String college;
}
class A{
   public static void main(String []args )
   {
      Student s1,s2;
      s1 = new Student();
      s2 = new Student();
      Student s3 = new Student();
      s3.college = "ABC";
      s1.name = "saurabh";
      s2.name = "vishwajeet";
      s3.name = "rajat";
      System.out.println(s1.name);
      System.out.println(s2.name);
      System.out.println(s3.name);
      System.out.println(s1.college);
      System.out.println(s2.college);
      System.out.println(s3.college);
   }
}