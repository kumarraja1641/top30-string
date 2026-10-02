import java.util.*;
public class Removedupchar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String str=sc.nextLine ();
        int arr[]=new int[256];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            arr[ch]++;
        }
        System.out.println("String after removing duplicate characters: ");
        for(int i=0;i<256;i++)
        {
            if(arr[i]==1)
            {
                System.out.print((char)(i)+" ");
            }
        }
        hash(str);
    }
    public static void hash(String str)
    {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        System.out.println("String after removing duplicate characters: ");
        for(Character ch : set)
        {
            System.out.print(ch+" ");
        }
        System.out.println(set);
    }
}
