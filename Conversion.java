import java.io.*;
class Conversion
{
  public static void main(String args[])throws IOException
   {
    String a;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    a=br.readLine();
    int b=Integer.valueOf(a);
    System.out.println(b);
    }
   }
