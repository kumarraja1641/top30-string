import java.util.*;
public class Palimdromeignorespecial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");

        String s1=sc.nextLine();

        boolean b1=true;
        
        int i=0,j=s1.length()-1;
        while(i<j)
        {
            char ch1=s1.charAt(i);
            char ch2=s1.charAt(j);

           while(!Character.isLetterOrDigit(ch1))
           {
            i++;
            ch1=s1.charAt(i);
           }
           while(!Character.isLetterOrDigit(ch2))
           {
            j--;
            ch2=s1.charAt(j);
           }

           if(Character.toLowerCase(ch1) != Character.toLowerCase(ch2))
           {
            b1=false;
           }
           i++;
           j--;
        }
        if(b1)
        {
            System.out.println("palimdrome");
        }
        else
        {
            System.out.println("not palimdrome");
        }
    }
    
}
