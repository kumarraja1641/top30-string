import java.util.*;
public class Firstrepeatingchar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        arr(s1);

    }
    public static void arr(String s1)
    {
        int cn=0;
        int[] ar=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            ar[ch]++;
        }
        for(int i=0;i<s1.length();i++)
        {
            char ch2=s1.charAt(i);
          //  if(ar[ch2]>1)
           // {

                
             //   System.err.println("first repeating character is" +"  "+ ch2);
               // break;
         //   }
             if(ar[ch2]>1)
            {
                cn++;
                if(cn==2)
                {
                System.err.println("second  repeating character is" +"  "+ ch2);
                break;
                }
            }

        }

    }
}
