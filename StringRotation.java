import java.util.*;
public class StringRotation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two string ");

        String s1=sc.next();
        String s2=sc.next();
       // boolean s=check(s1,s2);
       /* if(s)
        {
            System.out.println("each other");
        }
        else
        {
            System.out.println("not each other");
        }
            */ 


        using(s1,s2);



    }
    public static boolean check(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;

        String combined=s1+s1;
        return combined.contains(s2);

    }
    public static void using(String s1,String s2)
    {
        StringBuilder sb1=new StringBuilder(s2);

        if(s1.equals(s2))
        {
            System.out.println("each other");
            return;
        }

        if(s1.length()!=s2.length())
        {
            System.out.println("not a each");
        }
        else
        {
            for(int i=0;i<s1.length();i++)
            {
                char ch=s2.charAt(i);
                sb1.deleteCharAt(0);
                sb1.append(ch);

                String s3=sb1.toString();
                if(s1.equals(s3))
                {
                    System.out.println("each other");
                    return;
                }


                /// or
                /// char ch=sb1.charAt(0);
                /// sb1.deleteCharAt(0);
                /// sb1.append(ch)
                /// if(s1.equals(sb1.toString()))
                /// 

            }
            System.out.println("not each other");
        }
    }
}