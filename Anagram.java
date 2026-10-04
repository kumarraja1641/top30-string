import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two strings");
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        // general method
        if(s1.length()!=s2.length())
        {
            System.out.println("two strings are not anagram to each other");
            return;
        }
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(Arrays.equals(ch1,ch2))
        {
        System.out.println("two strings are anagram");
        //return;
        }
        else
        {
            System.out.println("not anagram");
        }

        // using hasmap
        hash(s1,s2);


    }
    public static void hash(String s1,String s2)
    {
        boolean f1=true;
        if(s1.length()!=s2.length())
        {
            System.out.println("not anagram");
           return;
        }
        else
        {
        HashMap<Character,Integer>h1=new HashMap<>();
         HashMap<Character,Integer>h2=new HashMap<>();

         for(int i=0;i<s1.length();i++)
         {
            char ch=s1.charAt(i);
            char ch2=s2.charAt(i);

            if(h1.containsKey(ch))
                h1.put(ch,h1.get(ch)+1);
            else
                h1.put(ch,1);

              if(h2.containsKey(ch2))
                h2.put(ch2,h1.get(ch2)+1);
            else
                h2.put(ch2,1);
         }
         for(int i=0;i<s1.length();i++)
         {
            char ch=s1.charAt(i);
            if(h1.get(ch)!=h2.get(ch))
                f1=false;
                System.out.println("not anagram");
         }
         if(f1)
         {
            System.err.println("not anagram");
         }
         else
         {
            System.err.println("anagram");
         }
    } 
  }
}
