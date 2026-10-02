import java.util.*;
public class Length {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine ();
        int length=str.length();
        System.out.println("Length of the string is: " + length);
        int len=Len(str);
        System.out.println("Length of the string using method is: " + len);
    }
    public static int Len(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            count++;
        }
        return count;
    }
}
