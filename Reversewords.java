import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
public class Reversewords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter a senetence");
        String s1=sc.nextLine();
        String[] words=s1.split(" ");
      /*   for(int i=words.length-1;i>=0;i--)
        {
            System.err.print(words[i]+" " );
        }
        */

        // using Stringbuilder
        reverses(s1);



    }
    public static void reverses(String s1)
    {
        String[] words=s1.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--)
        {
            sb.append(words[i]).append(" ");
        }
        System.err.println("original String is "+" "+ s1);
        System.out.println("reverse words are "+sb.toString().trim());

    }
}
