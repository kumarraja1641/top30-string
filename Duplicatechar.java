import java.util.*;
public class Duplicatechar {
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
            if(arr[i]>1)
            {
                System.out.println((char)(i) + " : " + arr[i]);
            }
        }
        hashdup(str);
    }
        public static void hashdup(String str)
        {
            HashMap<Character,Integer>map=new HashMap<>();
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
            for(Map.Entry<Character,Integer> ente:map.entrySet())
            {
                if(ente.getValue()>1)
                {
                    System.out.println(ente.getKey() + " : " + ente.getValue());
                }
            }

        }
    
}
