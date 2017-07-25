import java.util.*;
class Integer{
  public static void main(String args[])
  {
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    a=sc.nextInt();
    String b=String.valueOf(a);
    StringBuilder a1=new StringBuilder(b);
    a1.reverse();
    System.out.println(a1);
    }
    }
