import java.util.*;

public class Palimdrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine ();

        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("String is Palimdrome");
        }
        else
        {
            System.out.println("String is not Palimdrome");
        }

        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("String is Palimdrome");
        }
        else
        {
            System.out.println("String is not Palimdrome");
        }

        if(str==rev)
        {
            System.out.println("String is Palimdrome");
        }
        else
        {
            System.out.println("String is not Palimdrome");
        }

        checkPalindrome(str);
    }

    // using two pointers

    public static void checkPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                System.out.println("String is not Palindrome");
                return;
            }
            l++;
            r--;
        }
        System.out.println("String is Palindrome");
    }




      
    
}
