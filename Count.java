import java.util.*;
public class Count {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine ();
        int vcount=0,ccount=0,num=0,special=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                vcount++;
            }
            else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
            {
                ccount++;
            }

            else if(ch>='0'&& ch<='9')
            {
              //  System.out.println("String contains number");
              num++;
            }
            else
            {
               // System.out.println("String contains special character");
               special++;
            }
        }
        System.out.println("Vowels: " + vcount);
        System.out.println("Consonants: " + ccount);
        System.out.println("Numbers: " + num);
        System.out.println("Special Characters: " + special);
    }
    
}
