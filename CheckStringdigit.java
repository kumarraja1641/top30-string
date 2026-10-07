import java.util.*;
public class CheckStringdigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String s1=sc.next();
        boolean b1=true;

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            if(ch>='0' && ch<='9')
            {

            }
            else
            {
                b1=false;
                break;
            }
        }
        if(b1)
        {
            System.out.println("contains only digits");

        }
        else
        {
            System.out.println("contains also charcters");
        }


        checkto(s1);
    }
    public static void checkto(String s2)
    {
        int cnt=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s2.length();i++)
        {

        char ch=s2.charAt(i);


        if(Character.isDigit(ch))
        {
            cnt++;
            sb.append(ch);

            if(cnt == 5)
            {
                System.out.println(sb);
                break;
            }
        }
        else
        {
            cnt=0;
            sb.delete(0, sb.length());
        }
        }


       
            
        
    }
}