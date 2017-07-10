import java.util.*;
class Reverse{
  public static void main(String args[])
  {
  String a;
    
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
    a=sc.nextLine();
    StringBuilder a1=new StringBuilder(a);
    a1.reverse();
    System.out.println(a1);
    }
    }
