import java.util.*;
public class Longestword {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        String[] s2=s1.split("\\s+");
        int cnt=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s2.length;i++)
        {
            if(s2[i].length()>cnt)
            {
                cnt=s2[i].length();
                sb.delete(0,sb.length());
                sb.append(s2[i]);

            }
        }
        System.out.println("the longest word in a sentence is "+" "+ sb.toString());


        /*
         String[] words = s1.trim().split("\\s+");
        int maxLen = 0;
        List<String> longestWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
                longestWords.clear();      // reset list
                longestWords.add(word);    // add new longest word
            } else if (word.length() == maxLen) {
                longestWords.add(word);    // add another word of same length
            }
        }
        
        */





    }
    
}
