import java.io.*;

public class Roman {

public static void main(String args[])throws IOException
{    int a;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter the number");
     a=Integer.parseInt(br.readLine());
     
    if(a>0&&a<4000) 
    {
        String thou[]={"","M","MM","MMM"};
        String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
      
        int th=a/1000;
        int h=(a/100)%10;
        int t=(a/10)%10;
        int u=a%10;
        System.out.println("The Roman Numeral of " + a + " is " + thou[th]+hund[h]+ten[t]+unit[u]);
    }

    else
        System.out.println("\nYou entered a number out of Range.\nPlease enter a number in the range [1-3999]");
}
}
