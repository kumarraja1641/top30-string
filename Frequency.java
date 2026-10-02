import java.util.*;
public class Frequency {
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
       for(int i=0;i<256;i++)
        {
            if(arr[i]>0)
            {
                System.out.println((char)(i) + " : " + arr[i]);
            }
        }

        hash(str);
    }
    public static void hash(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
       for(Map.Entry<Character,Integer> entry:map.entrySet())
       {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
    }


    
}
