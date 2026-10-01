import java.util.*;
public class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine ();

        char ch[]=str.toCharArray();
      int l=0,r=ch.length-1;
       while(l<r)
       {
           char temp=ch[l];
           ch[l]=ch[r];
           ch[r]=temp;
           l++;
           r--;
       }

       String s1=new String(ch);
       System.out.println("Reverse of the String is: "+s1);
          

      //  String rev="";
      /*   for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse of the String is: "+rev);
        */

        // 2nd wayt is 

            /*  String rev=new StringBuffer(str).reverse().toString();

              System.out.println("reverse of string is"+ " "+ rev);

           */

    }

}