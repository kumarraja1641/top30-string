import java.util.*;

public class Firstnonrepeatingchar {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a string");
        String str = sc.nextLine();

      //  arr(str);
      // using hashmap
      hashed(str);
    }
    public static void hashed(String str)
    {
        LinkedHashMap<Character,Integer>h1=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(h1.containsKey(str.charAt(i)))
            {
                h1.put(str.charAt(i),h1.get(str.charAt(i))+1);
            }
            else
            {
                h1.put(str.charAt(i),1);
            }
        }
        System.err.println("first non repeating charcter is");
        for(Map.Entry<Character,Integer> map:h1.entrySet())
        {
            if(map.getValue()==1)
            {
                System.err.println(map.getKey());
                break;
            }
        }
    }

    public static void arr(String str) {

        int[] arr = new int[256];

        // Count characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch]++;
        }

        char ch = ' ';

        // Find first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                ch = str.charAt(i);
                break;
            }
        }

        System.out.println("First non repeating character in string " + ch);
    }
}